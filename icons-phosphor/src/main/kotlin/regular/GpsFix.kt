package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorRegularIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 120.000 L 215.630 120.000 C 211.718 77.748 178.252 44.282 136.000 40.370 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 40.370 C 77.748 44.282 44.282 77.748 40.370 120.000 L 16.000 120.000 C 11.582 120.000 8.000 123.582 8.000 128.000 C 8.000 132.418 11.582 136.000 16.000 136.000 L 40.370 136.000 C 44.282 178.252 77.748 211.718 120.000 215.630 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 215.630 C 178.252 211.718 211.718 178.252 215.630 136.000 L 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 ZM 128.000 200.000 C 88.235 200.000 56.000 167.764 56.000 128.000 C 56.000 88.235 88.235 56.000 128.000 56.000 C 167.764 56.000 200.000 88.235 200.000 128.000 C 199.956 167.746 167.746 199.956 128.000 200.000 ZM 128.000 88.000 C 105.909 88.000 88.000 105.909 88.000 128.000 C 88.000 150.091 105.909 168.000 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
