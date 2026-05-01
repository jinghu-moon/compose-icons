package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorBoldIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 140.0f),
                    PathNode.CurveTo(156.0f, 146.62741f, 150.62741f, 152.0f, 144.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(107.57049f, 152.00658f, 103.497574f, 149.57246f, 101.40528f, 145.66824f),
                    PathNode.CurveTo(99.31299f, 141.76402f, 99.54161f, 137.02469f, 102.0f, 133.34f),
                    PathNode.LineTo(121.58f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.CurveTo(105.37258f, 104.0f, 100.0f, 98.62742f, 100.0f, 92.0f),
                    PathNode.CurveTo(100.0f, 85.37258f, 105.37258f, 80.0f, 112.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(148.42952f, 79.99343f, 152.50243f, 82.427536f, 154.59473f, 86.33176f),
                    PathNode.CurveTo(156.68701f, 90.23598f, 156.45839f, 94.97531f, 154.0f, 98.66f),
                    PathNode.LineTo(134.42f, 128.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(150.62741f, 128.0f, 156.0f, 133.37259f, 156.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.33f, 186.0f),
                    PathNode.CurveTo(221.79099f, 192.2262f, 215.16151f, 196.05162f, 208.0f, 196.0f),
                    PathNode.LineTo(171.82f, 196.0f),
                    PathNode.CurveTo(169.7634f, 218.6668f, 150.7599f, 236.02412f, 128.0f, 236.02412f),
                    PathNode.CurveTo(105.2401f, 236.02412f, 86.2366f, 218.6668f, 84.18f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(40.845615f, 196.04436f, 34.225506f, 192.21991f, 30.69f, 186.0f),
                    PathNode.CurveTo(27.126205f, 179.78339f, 27.14526f, 172.13876f, 30.74f, 165.94f),
                    PathNode.CurveTo(39.39f, 151.0f, 44.0f, 129.58f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 57.60808f, 81.60808f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(174.39192f, 20.0f, 212.0f, 57.60808f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 129.57f, 216.59f, 151.0f, 225.27f, 165.93f),
                    PathNode.CurveTo(228.87479f, 172.12773f, 228.90146f, 179.77728f, 225.34f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.6f, 196.0f),
                    PathNode.LineTo(108.4f, 196.0f),
                    PathNode.CurveTo(110.29277f, 205.32129f, 118.48847f, 212.02005f, 128.0f, 212.02005f),
                    PathNode.CurveTo(137.51152f, 212.02005f, 145.70723f, 205.32129f, 147.6f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.34f, 172.0f),
                    PathNode.CurveTo(192.49f, 154.0f, 188.0f, 131.13f, 188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 70.862915f, 161.13708f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(94.862915f, 44.0f, 68.0f, 70.862915f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 131.14f, 63.52f, 154.0f, 54.67f, 172.0f),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
