package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorBoldIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 84.0f),
                    PathNode.CurveTo(185.30183f, 83.99473f, 182.61385f, 84.33073f, 180.0f, 85.0f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.CurveTo(180.00911f, 49.50465f, 174.87103f, 39.672f, 166.24985f, 33.686428f),
                    PathNode.CurveTo(157.62863f, 27.70086f, 146.62029f, 26.323343f, 136.79f, 30.0f),
                    PathNode.CurveTo(130.27785f, 16.578564f, 115.35568f, 9.437396f, 100.818344f, 12.78536f),
                    PathNode.CurveTo(86.281006f, 16.133326f, 75.98558f, 29.082127f, 76.0f, 44.0f),
                    PathNode.LineTo(76.0f, 45.0f),
                    PathNode.CurveTo(66.41433f, 42.524994f, 56.222843f, 44.6261f, 48.3977f, 50.690582f),
                    PathNode.CurveTo(40.572563f, 56.75507f, 35.995007f, 66.09996f, 36.0f, 76.0f),
                    PathNode.LineTo(36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 202.8102f, 77.18981f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.8102f, 244.0f, 220.0f, 202.8102f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 116.0f),
                    PathNode.CurveTo(220.0f, 98.32689f, 205.67311f, 84.0f, 188.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 152.0f),
                    PathNode.CurveTo(196.0f, 189.55536f, 165.55536f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(90.44463f, 220.0f, 60.0f, 189.55536f, 60.0f, 152.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.CurveTo(60.0f, 71.58172f, 63.581722f, 68.0f, 68.0f, 68.0f),
                    PathNode.CurveTo(72.41828f, 68.0f, 76.0f, 71.58172f, 76.0f, 76.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.CurveTo(76.0f, 122.62742f, 81.37258f, 128.0f, 88.0f, 128.0f),
                    PathNode.CurveTo(94.62742f, 128.0f, 100.0f, 122.62742f, 100.0f, 116.0f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.CurveTo(100.0f, 39.581722f, 103.58172f, 36.0f, 108.0f, 36.0f),
                    PathNode.CurveTo(112.41828f, 36.0f, 116.0f, 39.581722f, 116.0f, 44.0f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.CurveTo(116.0f, 114.62742f, 121.37258f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(134.62741f, 120.0f, 140.0f, 114.62742f, 140.0f, 108.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.CurveTo(140.0f, 55.581722f, 143.58173f, 52.0f, 148.0f, 52.0f),
                    PathNode.CurveTo(152.41827f, 52.0f, 156.0f, 55.581722f, 156.0f, 60.0f),
                    PathNode.LineTo(156.0f, 125.4f),
                    PathNode.CurveTo(132.57169f, 130.99031f, 116.031235f, 151.91397f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 182.62741f, 121.37258f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(134.62741f, 188.0f, 140.0f, 182.62741f, 140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 160.53603f, 152.53603f, 148.0f, 168.0f, 148.0f),
                    PathNode.CurveTo(174.62741f, 148.0f, 180.0f, 142.62741f, 180.0f, 136.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.CurveTo(180.0f, 111.58172f, 183.58173f, 108.0f, 188.0f, 108.0f),
                    PathNode.CurveTo(192.41827f, 108.0f, 196.0f, 111.58172f, 196.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
