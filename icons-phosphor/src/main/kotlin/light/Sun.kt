package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorLightIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.0f, 40.0f),
                    PathNode.LineTo(122.0f, 16.0f),
                    PathNode.CurveTo(122.0f, 12.686292f, 124.686295f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(131.3137f, 10.0f, 134.0f, 12.686292f, 134.0f, 16.0f),
                    PathNode.LineTo(134.0f, 40.0f),
                    PathNode.CurveTo(134.0f, 43.31371f, 131.3137f, 46.0f, 128.0f, 46.0f),
                    PathNode.CurveTo(124.686295f, 46.0f, 122.0f, 43.31371f, 122.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 162.24165f, 162.24165f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(93.75835f, 190.0f, 66.0f, 162.24165f, 66.0f, 128.0f),
                    PathNode.CurveTo(66.0f, 93.75835f, 93.75835f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(162.22566f, 66.038574f, 189.96143f, 93.77434f, 190.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 100.385765f, 155.61424f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(100.385765f, 78.0f, 78.0f, 100.385765f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 155.61424f, 100.385765f, 178.0f, 128.0f, 178.0f),
                    PathNode.CurveTo(155.60052f, 177.96693f, 177.96693f, 155.60052f, 178.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(59.76f, 68.24f),
                    PathNode.CurveTo(61.255764f, 69.84522f, 63.508446f, 70.506f, 65.63431f, 69.96308f),
                    PathNode.CurveTo(67.76018f, 69.42017f, 69.42017f, 67.76018f, 69.96308f, 65.63431f),
                    PathNode.CurveTo(70.506f, 63.508446f, 69.84522f, 61.255764f, 68.24f, 59.76f),
                    PathNode.LineTo(52.24f, 43.76f),
                    PathNode.CurveTo(49.875923f, 41.55713f, 46.19192f, 41.622128f, 43.907024f, 43.907024f),
                    PathNode.CurveTo(41.622128f, 46.19192f, 41.55713f, 49.875923f, 43.76f, 52.24f),
                    PathNode.Close,
                    PathNode.MoveTo(59.76f, 187.76f),
                    PathNode.LineTo(43.76f, 203.76f),
                    PathNode.CurveTo(42.154774f, 205.25575f, 41.494007f, 207.50844f, 42.036915f, 209.63431f),
                    PathNode.CurveTo(42.579826f, 211.76018f, 44.239822f, 213.42018f, 46.36569f, 213.96309f),
                    PathNode.CurveTo(48.491554f, 214.506f, 50.744236f, 213.84523f, 52.24f, 212.24f),
                    PathNode.LineTo(68.24f, 196.24f),
                    PathNode.CurveTo(69.84522f, 194.74425f, 70.506f, 192.49156f, 69.96308f, 190.36569f),
                    PathNode.CurveTo(69.42017f, 188.23982f, 67.76018f, 186.57982f, 65.63431f, 186.03691f),
                    PathNode.CurveTo(63.508446f, 185.494f, 61.255764f, 186.15477f, 59.76f, 187.76f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 70.0f),
                    PathNode.CurveTo(193.59076f, 69.9986f, 195.11586f, 69.36554f, 196.24f, 68.24f),
                    PathNode.LineTo(212.24f, 52.24f),
                    PathNode.CurveTo(214.44287f, 49.875923f, 214.37787f, 46.19192f, 212.09297f, 43.907024f),
                    PathNode.CurveTo(209.80807f, 41.622128f, 206.12408f, 41.55713f, 203.76f, 43.76f),
                    PathNode.LineTo(187.76f, 59.76f),
                    PathNode.CurveTo(186.04623f, 61.475895f, 185.53394f, 64.05473f, 186.4617f, 66.29539f),
                    PathNode.CurveTo(187.38948f, 68.53604f, 189.57486f, 69.99786f, 192.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.24f, 187.76f),
                    PathNode.CurveTo(193.87592f, 185.55713f, 190.19193f, 185.62213f, 187.90703f, 187.90703f),
                    PathNode.CurveTo(185.62213f, 190.19193f, 185.55713f, 193.87592f, 187.76f, 196.24f),
                    PathNode.LineTo(203.76f, 212.24f),
                    PathNode.CurveTo(206.12408f, 214.44287f, 209.80807f, 214.37787f, 212.09297f, 212.09297f),
                    PathNode.CurveTo(214.37787f, 209.80807f, 214.44287f, 206.12408f, 212.24f, 203.76f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 128.0f),
                    PathNode.CurveTo(46.0f, 124.686295f, 43.31371f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(16.0f, 122.0f),
                    PathNode.CurveTo(12.686292f, 122.0f, 10.0f, 124.686295f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 131.3137f, 12.686292f, 134.0f, 16.0f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(43.31371f, 134.0f, 46.0f, 131.3137f, 46.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.0f),
                    PathNode.CurveTo(124.686295f, 210.0f, 122.0f, 212.6863f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 212.6863f, 131.3137f, 210.0f, 128.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(212.6863f, 122.0f, 210.0f, 124.686295f, 210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 131.3137f, 212.6863f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(240.0f, 134.0f),
                    PathNode.CurveTo(243.3137f, 134.0f, 246.0f, 131.3137f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 124.686295f, 243.3137f, 122.0f, 240.0f, 122.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sun!!
    }

private var _sun: ImageVector? = null
