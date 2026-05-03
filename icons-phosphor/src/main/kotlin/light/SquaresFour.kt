package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorLightIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 42.000 L 56.000 42.000 C 48.268 42.000 42.000 48.268 42.000 56.000 L 42.000 104.000 C 42.000 111.732 48.268 118.000 56.000 118.000 L 104.000 118.000 C 111.732 118.000 118.000 111.732 118.000 104.000 L 118.000 56.000 C 118.000 48.268 111.732 42.000 104.000 42.000 ZM 106.000 104.000 C 106.000 105.105 105.105 106.000 104.000 106.000 L 56.000 106.000 C 54.895 106.000 54.000 105.105 54.000 104.000 L 54.000 56.000 C 54.000 54.895 54.895 54.000 56.000 54.000 L 104.000 54.000 C 105.105 54.000 106.000 54.895 106.000 56.000 ZM 200.000 42.000 L 152.000 42.000 C 144.268 42.000 138.000 48.268 138.000 56.000 L 138.000 104.000 C 138.000 111.732 144.268 118.000 152.000 118.000 L 200.000 118.000 C 207.732 118.000 214.000 111.732 214.000 104.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 ZM 202.000 104.000 C 202.000 105.105 201.105 106.000 200.000 106.000 L 152.000 106.000 C 150.895 106.000 150.000 105.105 150.000 104.000 L 150.000 56.000 C 150.000 54.895 150.895 54.000 152.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 ZM 104.000 138.000 L 56.000 138.000 C 48.268 138.000 42.000 144.268 42.000 152.000 L 42.000 200.000 C 42.000 207.732 48.268 214.000 56.000 214.000 L 104.000 214.000 C 111.732 214.000 118.000 207.732 118.000 200.000 L 118.000 152.000 C 118.000 144.268 111.732 138.000 104.000 138.000 ZM 106.000 200.000 C 106.000 201.105 105.105 202.000 104.000 202.000 L 56.000 202.000 C 54.895 202.000 54.000 201.105 54.000 200.000 L 54.000 152.000 C 54.000 150.895 54.895 150.000 56.000 150.000 L 104.000 150.000 C 105.105 150.000 106.000 150.895 106.000 152.000 ZM 200.000 138.000 L 152.000 138.000 C 144.268 138.000 138.000 144.268 138.000 152.000 L 138.000 200.000 C 138.000 207.732 144.268 214.000 152.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 152.000 C 214.000 144.268 207.732 138.000 200.000 138.000 ZM 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 L 152.000 202.000 C 150.895 202.000 150.000 201.105 150.000 200.000 L 150.000 152.000 C 150.000 150.895 150.895 150.000 152.000 150.000 L 200.000 150.000 C 201.105 150.000 202.000 150.895 202.000 152.000 Z"),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
