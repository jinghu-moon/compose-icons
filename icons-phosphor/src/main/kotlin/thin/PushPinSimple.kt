package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorThinIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 172.000 L 203.360 172.000 L 180.770 44.000 L 192.000 44.000 C 194.209 44.000 196.000 42.209 196.000 40.000 C 196.000 37.791 194.209 36.000 192.000 36.000 L 64.000 36.000 C 61.791 36.000 60.000 37.791 60.000 40.000 C 60.000 42.209 61.791 44.000 64.000 44.000 L 75.230 44.000 L 52.640 172.000 L 40.000 172.000 C 37.791 172.000 36.000 173.791 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 L 124.000 180.000 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 180.000 L 216.000 180.000 C 218.209 180.000 220.000 178.209 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 ZM 83.360 44.000 L 172.640 44.000 L 195.230 172.000 L 60.770 172.000 Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
