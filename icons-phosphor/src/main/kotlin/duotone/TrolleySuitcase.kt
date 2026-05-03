package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorDuotoneIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 72.000 L 224.000 144.000 C 224.000 148.418 220.418 152.000 216.000 152.000 L 88.000 152.000 C 83.582 152.000 80.000 148.418 80.000 144.000 L 80.000 72.000 C 80.000 67.582 83.582 64.000 88.000 64.000 L 216.000 64.000 C 220.418 64.000 224.000 67.582 224.000 72.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 88.000 224.000 C 88.000 232.837 80.837 240.000 72.000 240.000 C 63.163 240.000 56.000 232.837 56.000 224.000 C 56.000 215.163 63.163 208.000 72.000 208.000 C 80.837 208.000 88.000 215.163 88.000 224.000 ZM 216.000 208.000 C 207.163 208.000 200.000 215.163 200.000 224.000 C 200.000 232.837 207.163 240.000 216.000 240.000 C 224.837 240.000 232.000 232.837 232.000 224.000 C 232.000 215.163 224.837 208.000 216.000 208.000 ZM 240.000 176.000 L 56.000 176.000 L 56.000 75.310 C 56.014 71.064 54.324 66.990 51.310 64.000 L 29.660 42.340 C 26.534 39.214 21.466 39.214 18.340 42.340 C 15.214 45.466 15.214 50.534 18.340 53.660 L 40.000 75.310 L 40.000 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 240.000 192.000 C 244.418 192.000 248.000 188.418 248.000 184.000 C 248.000 179.582 244.418 176.000 240.000 176.000 ZM 72.000 144.000 L 72.000 72.000 C 72.000 63.163 79.163 56.000 88.000 56.000 L 120.000 56.000 L 120.000 40.000 C 120.000 31.163 127.163 24.000 136.000 24.000 L 168.000 24.000 C 176.837 24.000 184.000 31.163 184.000 40.000 L 184.000 56.000 L 216.000 56.000 C 224.837 56.000 232.000 63.163 232.000 72.000 L 232.000 144.000 C 232.000 152.837 224.837 160.000 216.000 160.000 L 88.000 160.000 C 79.163 160.000 72.000 152.837 72.000 144.000 ZM 136.000 56.000 L 168.000 56.000 L 168.000 40.000 L 136.000 40.000 ZM 88.000 144.000 L 216.000 144.000 L 216.000 72.000 L 88.000 72.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
