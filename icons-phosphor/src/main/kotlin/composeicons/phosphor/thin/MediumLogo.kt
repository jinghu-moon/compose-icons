package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorThinIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 68C38.863 68 12 94.863 12 128c0 33.137 26.863 60 60 60 33.137 0 60-26.863 60-60C131.961 94.879 105.121 68.039 72 68ZM72 180C43.281 180 20 156.719 20 128 20 99.281 43.281 76 72 76c28.719 0 52 23.281 52 52-.033 28.705-23.295 51.967-52 52ZM184 68c-16 0-28 25.79-28 60 0 34.21 12 60 28 60 16 0 28-25.79 28-60C212 93.79 200 68 184 68ZM184 180c-9.46 0-20-21.36-20-52 0-30.64 10.54-52 20-52 9.46 0 20 21.36 20 52 0 30.64-10.54 52-20 52ZM244 72v112c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
