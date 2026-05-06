package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorBoldIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 207c-8.842-10.348-15.749-22.204-20.39-35h40.82c-2.641 7.236-5.991 14.193-10 20.77-3.085 5.018-6.573 9.777-10.43 14.23ZM101.51 148c-1.98-13.26-1.98-26.74 0-40h53c1.98 13.26 1.98 26.74 0 40ZM44 128c-0-6.74 .816-13.456 2.43-20h30.82c-1.667 13.281-1.667 26.719 0 40h-30.82C44.816 141.456 44 134.74 44 128ZM128 49c8.842 10.348 15.749 22.204 20.39 35h-40.8c2.641-7.236 5.991-14.193 10-20.77C120.669 58.212 124.15 53.453 128 49ZM178.73 108h30.82c3.24 13.137 3.24 26.863 0 40h-30.8c1.667-13.281 1.667-26.719 0-40ZM199.5 84h-25.79C170.107 71.904 164.893 60.347 158.21 49.64c17.141 6.654 31.645 18.718 41.31 34.36ZM97.79 49.64C91.107 60.347 85.893 71.904 82.29 84h-25.81C66.145 68.358 80.649 56.294 97.79 49.64ZM56.48 172h25.81c3.603 12.096 8.817 23.653 15.5 34.36C80.649 199.706 66.145 187.642 56.48 172ZM158.21 206.36c6.683-10.707 11.896-22.264 15.5-34.36h25.81c-9.665 15.642-24.169 27.706-41.31 34.36Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _globe!!
    }

private var _globe: ImageVector? = null
