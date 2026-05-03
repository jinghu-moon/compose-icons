package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorLightIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 114.000 L 48.000 114.000 C 44.686 114.000 42.000 116.686 42.000 120.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 L 136.000 214.000 C 139.314 214.000 142.000 211.314 142.000 208.000 L 142.000 120.000 C 142.000 116.686 139.314 114.000 136.000 114.000 ZM 130.000 202.000 L 54.000 202.000 L 54.000 126.000 L 130.000 126.000 ZM 214.000 184.000 L 214.000 200.000 C 214.000 207.732 207.732 214.000 200.000 214.000 L 176.000 214.000 C 172.686 214.000 170.000 211.314 170.000 208.000 C 170.000 204.686 172.686 202.000 176.000 202.000 L 200.000 202.000 C 201.105 202.000 202.000 201.105 202.000 200.000 L 202.000 184.000 C 202.000 180.686 204.686 178.000 208.000 178.000 C 211.314 178.000 214.000 180.686 214.000 184.000 ZM 214.000 112.000 L 214.000 144.000 C 214.000 147.314 211.314 150.000 208.000 150.000 C 204.686 150.000 202.000 147.314 202.000 144.000 L 202.000 112.000 C 202.000 108.686 204.686 106.000 208.000 106.000 C 211.314 106.000 214.000 108.686 214.000 112.000 ZM 214.000 56.000 L 214.000 72.000 C 214.000 75.314 211.314 78.000 208.000 78.000 C 204.686 78.000 202.000 75.314 202.000 72.000 L 202.000 56.000 C 202.000 54.895 201.105 54.000 200.000 54.000 L 184.000 54.000 C 180.686 54.000 178.000 51.314 178.000 48.000 C 178.000 44.686 180.686 42.000 184.000 42.000 L 200.000 42.000 C 207.732 42.000 214.000 48.268 214.000 56.000 ZM 150.000 48.000 C 150.000 51.314 147.314 54.000 144.000 54.000 L 112.000 54.000 C 108.686 54.000 106.000 51.314 106.000 48.000 C 106.000 44.686 108.686 42.000 112.000 42.000 L 144.000 42.000 C 147.314 42.000 150.000 44.686 150.000 48.000 ZM 42.000 80.000 L 42.000 56.000 C 42.000 48.268 48.268 42.000 56.000 42.000 L 72.000 42.000 C 75.314 42.000 78.000 44.686 78.000 48.000 C 78.000 51.314 75.314 54.000 72.000 54.000 L 56.000 54.000 C 54.895 54.000 54.000 54.895 54.000 56.000 L 54.000 80.000 C 54.000 83.314 51.314 86.000 48.000 86.000 C 44.686 86.000 42.000 83.314 42.000 80.000 Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
