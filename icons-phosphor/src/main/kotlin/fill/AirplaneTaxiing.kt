package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorFillIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 136.0f),
                    PathNode.LineTo(248.0f, 160.0f),
                    PathNode.CurveTo(248.0f, 164.41827f, 244.41827f, 168.0f, 240.0f, 168.0f),
                    PathNode.LineTo(61.07f, 168.0f),
                    PathNode.CurveTo(43.378353f, 168.08107f, 27.762486f, 156.45985f, 22.76f, 139.49f),
                    PathNode.LineTo(8.69f, 92.6f),
                    PathNode.CurveTo(7.236515f, 87.75785f, 8.157041f, 82.51361f, 11.172718f, 78.45594f),
                    PathNode.CurveTo(14.188396f, 74.39827f, 18.94441f, 72.00458f, 24.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(34.118904f, 72.000984f, 36.150875f, 72.842545f, 37.65f, 74.34f),
                    PathNode.LineTo(59.32f, 96.0f),
                    PathNode.LineTo(81.81f, 96.0f),
                    PathNode.LineTo(72.81f, 69.06f),
                    PathNode.CurveTo(71.182846f, 64.17893f, 72.00227f, 58.813183f, 75.0121f, 54.640247f),
                    PathNode.CurveTo(78.02192f, 50.467316f, 82.854866f, 47.996403f, 88.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.CurveTo(98.12237f, 47.998333f, 100.158424f, 48.84009f, 101.66f, 50.34f),
                    PathNode.LineTo(147.32f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.CurveTo(230.09138f, 96.0f, 248.0f, 113.90861f, 248.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.CurveTo(199.16344f, 184.0f, 192.0f, 191.16344f, 192.0f, 200.0f),
                    PathNode.CurveTo(192.0f, 208.83656f, 199.16344f, 216.0f, 208.0f, 216.0f),
                    PathNode.CurveTo(216.83656f, 216.0f, 224.0f, 208.83656f, 224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 191.16344f, 216.83656f, 184.0f, 208.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.CurveTo(103.163445f, 184.0f, 96.0f, 191.16344f, 96.0f, 200.0f),
                    PathNode.CurveTo(96.0f, 208.83656f, 103.163445f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(120.836555f, 216.0f, 128.0f, 208.83656f, 128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 191.16344f, 120.836555f, 184.0f, 112.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
