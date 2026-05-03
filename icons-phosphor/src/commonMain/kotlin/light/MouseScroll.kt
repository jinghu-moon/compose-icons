package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorLightIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 18.0f),
                    PathNode.LineTo(112.0f, 18.0f),
                    PathNode.CurveTo(77.77434f, 18.038576f, 50.03858f, 45.774338f, 50.0f, 80.0f),
                    PathNode.LineTo(50.0f, 176.0f),
                    PathNode.CurveTo(50.03858f, 210.22566f, 77.77434f, 237.96143f, 112.0f, 238.0f),
                    PathNode.LineTo(144.0f, 238.0f),
                    PathNode.CurveTo(178.22566f, 237.96143f, 205.96143f, 210.22566f, 206.0f, 176.0f),
                    PathNode.LineTo(206.0f, 80.0f),
                    PathNode.CurveTo(205.96143f, 45.774338f, 178.22566f, 18.038576f, 144.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 176.0f),
                    PathNode.CurveTo(193.96693f, 203.60052f, 171.60052f, 225.96693f, 144.0f, 226.0f),
                    PathNode.LineTo(112.0f, 226.0f),
                    PathNode.CurveTo(84.39947f, 225.96693f, 62.03306f, 203.60052f, 62.0f, 176.0f),
                    PathNode.LineTo(62.0f, 80.0f),
                    PathNode.CurveTo(62.03306f, 52.399467f, 84.39947f, 30.033062f, 112.0f, 30.0f),
                    PathNode.LineTo(144.0f, 30.0f),
                    PathNode.CurveTo(171.60052f, 30.033062f, 193.96693f, 52.399467f, 194.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 78.49f),
                    PathNode.LineTo(134.0f, 177.49f),
                    PathNode.LineTo(147.76f, 163.74f),
                    PathNode.CurveTo(150.12408f, 161.53712f, 153.80807f, 161.60213f, 156.09297f, 163.88702f),
                    PathNode.CurveTo(158.37787f, 166.17192f, 158.44287f, 169.85593f, 156.24f, 172.22f),
                    PathNode.LineTo(132.24f, 196.22f),
                    PathNode.CurveTo(129.89746f, 198.55963f, 126.10254f, 198.55963f, 123.76f, 196.22f),
                    PathNode.LineTo(99.76f, 172.22f),
                    PathNode.CurveTo(97.55713f, 169.85593f, 97.62213f, 166.17192f, 99.90703f, 163.88702f),
                    PathNode.CurveTo(102.191925f, 161.60213f, 105.87592f, 161.53712f, 108.24f, 163.74f),
                    PathNode.LineTo(122.0f, 177.51f),
                    PathNode.LineTo(122.0f, 78.51f),
                    PathNode.LineTo(108.24f, 92.24f),
                    PathNode.CurveTo(105.87592f, 94.44287f, 102.191925f, 94.37787f, 99.90703f, 92.09297f),
                    PathNode.CurveTo(97.62213f, 89.808075f, 97.55713f, 86.12408f, 99.76f, 83.76f),
                    PathNode.LineTo(123.76f, 59.76f),
                    PathNode.CurveTo(126.10254f, 57.420372f, 129.89746f, 57.420372f, 132.24f, 59.76f),
                    PathNode.LineTo(156.24f, 83.76f),
                    PathNode.CurveTo(157.84523f, 85.25577f, 158.506f, 87.508446f, 157.96309f, 89.6343f),
                    PathNode.CurveTo(157.42018f, 91.76018f, 155.76018f, 93.42017f, 153.63431f, 93.96308f),
                    PathNode.CurveTo(151.50844f, 94.506f, 149.25575f, 93.84522f, 147.76f, 92.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
