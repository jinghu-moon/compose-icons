package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorThinIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 76C168 53.909 150.091 36 128 36 105.909 36 88 53.909 88 76c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40ZM128 108C110.327 108 96 93.673 96 76 96 58.327 110.327 44 128 44c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM188 132c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM188 204c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM68 132c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C108 149.909 90.091 132 68 132ZM68 204C50.327 204 36 189.673 36 172c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
