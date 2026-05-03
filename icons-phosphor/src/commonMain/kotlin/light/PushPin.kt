package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorLightIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.91f, 82.79f),
                    PathNode.LineTo(173.22f, 22.1f),
                    PathNode.CurveTo(170.59402f, 19.47112f, 167.03073f, 17.993986f, 163.315f, 17.993986f),
                    PathNode.CurveTo(159.59927f, 17.993986f, 156.03595f, 19.47112f, 153.41f, 22.1f),
                    PathNode.LineTo(98.93f, 76.77f),
                    PathNode.CurveTo(89.41f, 73.52f, 64.93f, 68.43f, 39.22f, 89.18f),
                    PathNode.CurveTo(36.11891f, 91.67263f, 34.22487f, 95.36698f, 34.011147f, 99.33992f),
                    PathNode.CurveTo(33.797424f, 103.31286f, 35.284218f, 107.18908f, 38.1f, 110.0f),
                    PathNode.LineTo(87.81f, 159.71f),
                    PathNode.LineTo(43.76f, 203.71f),
                    PathNode.CurveTo(42.154774f, 205.20576f, 41.494007f, 207.45845f, 42.036915f, 209.5843f),
                    PathNode.CurveTo(42.579826f, 211.71017f, 44.239822f, 213.37018f, 46.36569f, 213.91309f),
                    PathNode.CurveTo(48.491554f, 214.456f, 50.744236f, 213.79523f, 52.24f, 212.19f),
                    PathNode.LineTo(96.29f, 168.14f),
                    PathNode.LineTo(146.0f, 217.89f),
                    PathNode.CurveTo(148.62408f, 220.51912f, 152.18542f, 221.99762f, 155.9f, 222.0f),
                    PathNode.QuadTo(156.39f, 222.0f, 156.9f, 222.0f),
                    PathNode.CurveTo(160.93787f, 221.71336f, 164.654f, 219.69301f, 167.09f, 216.46f),
                    PathNode.CurveTo(186.81f, 190.25f, 184.24f, 169.23f, 179.55f, 157.16f),
                    PathNode.LineTo(233.92f, 102.61f),
                    PathNode.CurveTo(236.55061f, 99.982315f, 238.0279f, 96.41611f, 238.02602f, 92.69793f),
                    PathNode.CurveTo(238.02414f, 88.979744f, 236.54327f, 85.41503f, 233.91f, 82.79f),
                    PathNode.Close,
                    PathNode.MoveTo(225.42f, 94.1f),
                    PathNode.LineTo(225.42f, 94.1f),
                    PathNode.LineTo(168.15f, 151.56f),
                    PathNode.CurveTo(166.33127f, 153.38841f, 165.88437f, 156.17448f, 167.04f, 158.48f),
                    PathNode.CurveTo(176.98f, 178.36f, 165.33f, 198.8f, 157.5f, 209.2f),
                    PathNode.CurveTo(157.14989f, 209.65707f, 156.61978f, 209.9411f, 156.0453f, 209.9794f),
                    PathNode.CurveTo(155.47081f, 210.0177f, 154.90768f, 209.80656f, 154.5f, 209.4f),
                    PathNode.LineTo(46.58f, 101.51f),
                    PathNode.CurveTo(46.171173f, 101.105064f, 45.95657f, 100.543655f, 45.99103f, 99.96926f),
                    PathNode.CurveTo(46.025494f, 99.39487f, 46.305687f, 98.86315f, 46.76f, 98.51f),
                    PathNode.CurveTo(59.26f, 88.42f, 71.26f, 85.75f, 80.46f, 85.75f),
                    PathNode.CurveTo(86.38584f, 85.66072f, 92.26385f, 86.822685f, 97.71f, 89.16f),
                    PathNode.CurveTo(100.02851f, 90.30781f, 102.821655f, 89.84026f, 104.64f, 88.0f),
                    PathNode.LineTo(161.9f, 30.59f),
                    PathNode.CurveTo(162.27513f, 30.214445f, 162.78418f, 30.003428f, 163.315f, 30.003428f),
                    PathNode.CurveTo(163.84583f, 30.003428f, 164.35486f, 30.214445f, 164.73f, 30.59f),
                    PathNode.LineTo(225.42f, 91.27f),
                    PathNode.CurveTo(225.79555f, 91.645134f, 226.00658f, 92.15418f, 226.00658f, 92.685f),
                    PathNode.CurveTo(226.00658f, 93.21582f, 225.79555f, 93.72486f, 225.42f, 94.1f),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
