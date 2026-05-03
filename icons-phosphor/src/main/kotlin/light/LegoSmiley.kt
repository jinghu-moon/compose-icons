package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorLightIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 122.000 C 94.477 122.000 90.000 117.523 90.000 112.000 C 90.000 106.477 94.477 102.000 100.000 102.000 C 105.523 102.000 110.000 106.477 110.000 112.000 C 110.000 117.523 105.523 122.000 100.000 122.000 ZM 156.000 102.000 C 150.477 102.000 146.000 106.477 146.000 112.000 C 146.000 117.523 150.477 122.000 156.000 122.000 C 161.523 122.000 166.000 117.523 166.000 112.000 C 166.000 106.477 161.523 102.000 156.000 102.000 ZM 152.800 146.920 C 137.612 156.354 118.388 156.354 103.200 146.920 C 100.394 145.153 96.687 145.994 94.920 148.800 C 93.153 151.606 93.994 155.313 96.800 157.080 C 115.898 168.979 140.102 168.979 159.200 157.080 C 162.006 155.313 162.847 151.606 161.080 148.800 C 159.313 145.994 155.606 145.153 152.800 146.920 ZM 214.000 80.000 L 214.000 176.000 C 213.984 190.251 203.959 202.531 190.000 205.400 L 190.000 224.000 C 190.000 231.732 183.732 238.000 176.000 238.000 L 80.000 238.000 C 72.268 238.000 66.000 231.732 66.000 224.000 L 66.000 205.400 C 52.041 202.531 42.016 190.251 42.000 176.000 L 42.000 80.000 C 42.000 63.431 55.431 50.000 72.000 50.000 L 90.000 50.000 L 90.000 32.000 C 90.000 24.268 96.268 18.000 104.000 18.000 L 152.000 18.000 C 159.732 18.000 166.000 24.268 166.000 32.000 L 166.000 50.000 L 184.000 50.000 C 200.569 50.000 214.000 63.431 214.000 80.000 ZM 102.000 50.000 L 154.000 50.000 L 154.000 32.000 C 154.000 30.895 153.105 30.000 152.000 30.000 L 104.000 30.000 C 102.895 30.000 102.000 30.895 102.000 32.000 ZM 178.000 224.000 L 178.000 206.000 L 78.000 206.000 L 78.000 224.000 C 78.000 225.105 78.895 226.000 80.000 226.000 L 176.000 226.000 C 177.105 226.000 178.000 225.105 178.000 224.000 ZM 202.000 80.000 C 202.000 70.059 193.941 62.000 184.000 62.000 L 72.000 62.000 C 62.059 62.000 54.000 70.059 54.000 80.000 L 54.000 176.000 C 54.000 185.941 62.059 194.000 72.000 194.000 L 184.000 194.000 C 193.941 194.000 202.000 185.941 202.000 176.000 Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
