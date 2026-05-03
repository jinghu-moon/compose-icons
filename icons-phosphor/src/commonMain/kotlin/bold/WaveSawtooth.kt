package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorBoldIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.29f, 138.22f),
                    PathNode.LineTo(134.29f, 202.22f),
                    PathNode.CurveTo(130.58746f, 204.4989f, 125.94188f, 204.5969f, 122.14653f, 202.47615f),
                    PathNode.CurveTo(118.35118f, 200.35541f, 115.99978f, 196.34767f, 116.0f, 192.0f),
                    PathNode.LineTo(116.0f, 85.47f),
                    PathNode.LineTo(30.29f, 138.22f),
                    PathNode.CurveTo(24.645647f, 141.69388f, 17.253872f, 139.93436f, 13.780001f, 134.29f),
                    PathNode.CurveTo(10.306129f, 128.64565f, 12.06565f, 121.253876f, 17.71f, 117.78f),
                    PathNode.LineTo(121.71f, 53.78f),
                    PathNode.CurveTo(125.412544f, 51.5011f, 130.05812f, 51.403107f, 133.85347f, 53.523853f),
                    PathNode.CurveTo(137.64882f, 55.644596f, 140.00023f, 59.652332f, 140.0f, 64.0f),
                    PathNode.LineTo(140.0f, 170.53f),
                    PathNode.LineTo(225.71f, 117.78f),
                    PathNode.CurveTo(231.35435f, 114.30613f, 238.74612f, 116.06565f, 242.22f, 121.71f),
                    PathNode.CurveTo(245.69388f, 127.35435f, 243.93436f, 134.74612f, 238.29f, 138.22f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
