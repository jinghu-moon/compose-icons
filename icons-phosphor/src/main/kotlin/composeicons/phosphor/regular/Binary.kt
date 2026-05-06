package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorRegularIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 24C71.63 24 56 43.74 56 72c0 28.26 15.63 48 38 48 22.37 0 38-19.74 38-48C132 43.74 116.37 24 94 24ZM94 104C76.63 104 72 83.89 72 72 72 60.11 76.63 40 94 40c17.37 0 22 20.11 22 32 0 11.89-4.63 32-22 32ZM166 136c-22.37 0-38 19.74-38 48 0 28.26 15.63 48 38 48 22.37 0 38-19.74 38-48 0-28.26-15.63-48-38-48ZM166 216c-17.37 0-22-20.11-22-32 0-11.89 4.63-32 22-32 17.37 0 22 20.11 22 32 0 11.89-4.63 32-22 32ZM145 49.22c-1.031-1.855-1.282-4.044-.699-6.084 .583-2.041 1.953-3.766 3.809-4.796l24-13.33c2.478-1.379 5.5-1.343 7.944 .094 2.444 1.437 3.945 4.061 3.946 6.896v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-66.4l-12.12 6.73c-1.855 1.031-4.044 1.282-6.084 .699-2.041-.583-3.766-1.953-4.796-3.809ZM104 144v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-66.4l-12.12 6.73c-3.866 2.143-8.737 .746-10.88-3.12-2.143-3.866-.746-8.737 3.12-10.88L92.12 137c2.479-1.375 5.499-1.335 7.941 .104 2.442 1.439 3.94 4.062 3.939 6.896Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
