package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorLightIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.64f, 26.61f),
                    PathNode.CurveTo(152.58206f, 25.60201f, 150.12968f, 25.854233f, 148.32f, 27.26f),
                    PathNode.LineTo(77.94f, 82.0f),
                    PathNode.LineTo(32.0f, 82.0f),
                    PathNode.CurveTo(24.268015f, 82.0f, 18.0f, 88.26801f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 160.0f),
                    PathNode.CurveTo(18.0f, 167.73198f, 24.268015f, 174.0f, 32.0f, 174.0f),
                    PathNode.LineTo(77.94f, 174.0f),
                    PathNode.LineTo(148.32f, 228.74f),
                    PathNode.CurveTo(150.12946f, 230.14513f, 152.58113f, 230.39722f, 154.63866f, 229.3897f),
                    PathNode.CurveTo(156.69618f, 228.38219f, 158.0004f, 226.29095f, 158.0f, 224.0f),
                    PathNode.LineTo(158.0f, 32.0f),
                    PathNode.CurveTo(158.00076f, 29.709234f, 156.6971f, 27.617937f, 154.64f, 26.61f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 160.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 94.89543f, 30.89543f, 94.0f, 32.0f, 94.0f),
                    PathNode.LineTo(74.0f, 94.0f),
                    PathNode.LineTo(74.0f, 162.0f),
                    PathNode.LineTo(32.0f, 162.0f),
                    PathNode.CurveTo(30.89543f, 162.0f, 30.0f, 161.10457f, 30.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 211.73f),
                    PathNode.LineTo(86.0f, 165.06f),
                    PathNode.LineTo(86.0f, 90.94f),
                    PathNode.LineTo(146.0f, 44.27f),
                    PathNode.Close,
                    PathNode.MoveTo(244.24f, 147.73f),
                    PathNode.CurveTo(245.84523f, 149.22577f, 246.506f, 151.47844f, 245.96309f, 153.60431f),
                    PathNode.CurveTo(245.42018f, 155.73018f, 243.76018f, 157.39018f, 241.63431f, 157.93309f),
                    PathNode.CurveTo(239.50844f, 158.476f, 237.25575f, 157.81523f, 235.76f, 156.21f),
                    PathNode.LineTo(216.0f, 136.48f),
                    PathNode.LineTo(196.24f, 156.24f),
                    PathNode.CurveTo(193.87592f, 158.44287f, 190.19193f, 158.37787f, 187.90703f, 156.09297f),
                    PathNode.CurveTo(185.62213f, 153.80807f, 185.55713f, 150.12408f, 187.76f, 147.76f),
                    PathNode.LineTo(207.52f, 128.0f),
                    PathNode.LineTo(187.76f, 108.24f),
                    PathNode.CurveTo(185.55713f, 105.87592f, 185.62213f, 102.191925f, 187.90703f, 99.90703f),
                    PathNode.CurveTo(190.19193f, 97.62213f, 193.87592f, 97.55713f, 196.24f, 99.76f),
                    PathNode.LineTo(216.0f, 119.52f),
                    PathNode.LineTo(235.76f, 99.76f),
                    PathNode.CurveTo(238.12408f, 97.55713f, 241.80807f, 97.62213f, 244.09297f, 99.90703f),
                    PathNode.CurveTo(246.37787f, 102.191925f, 246.44287f, 105.87592f, 244.24f, 108.24f),
                    PathNode.LineTo(224.48f, 128.0f),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
