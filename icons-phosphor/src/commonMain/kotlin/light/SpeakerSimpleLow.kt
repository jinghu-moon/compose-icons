package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) return _speakerSimpleLow!!
        _speakerSimpleLow = phosphorLightIcon(
            name = "SpeakerSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.64f, 26.61f),
                    PathNode.CurveTo(160.58206f, 25.60201f, 158.12968f, 25.854233f, 156.32f, 27.26f),
                    PathNode.LineTo(85.94f, 82.0f),
                    PathNode.LineTo(40.0f, 82.0f),
                    PathNode.CurveTo(32.268013f, 82.0f, 26.0f, 88.26801f, 26.0f, 96.0f),
                    PathNode.LineTo(26.0f, 160.0f),
                    PathNode.CurveTo(26.0f, 167.73198f, 32.268013f, 174.0f, 40.0f, 174.0f),
                    PathNode.LineTo(85.94f, 174.0f),
                    PathNode.LineTo(156.32f, 228.74f),
                    PathNode.CurveTo(158.12946f, 230.14513f, 160.58113f, 230.39722f, 162.63866f, 229.3897f),
                    PathNode.CurveTo(164.69618f, 228.38219f, 166.0004f, 226.29095f, 166.0f, 224.0f),
                    PathNode.LineTo(166.0f, 32.0f),
                    PathNode.CurveTo(166.00076f, 29.709234f, 164.6971f, 27.617937f, 162.64f, 26.61f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 211.73f),
                    PathNode.LineTo(91.68f, 163.26f),
                    PathNode.CurveTo(90.62729f, 162.44301f, 89.33255f, 161.9997f, 88.0f, 162.0f),
                    PathNode.LineTo(40.0f, 162.0f),
                    PathNode.CurveTo(38.89543f, 162.0f, 38.0f, 161.10457f, 38.0f, 160.0f),
                    PathNode.LineTo(38.0f, 96.0f),
                    PathNode.CurveTo(38.0f, 94.89543f, 38.89543f, 94.0f, 40.0f, 94.0f),
                    PathNode.LineTo(88.0f, 94.0f),
                    PathNode.CurveTo(89.33255f, 94.000305f, 90.62729f, 93.557f, 91.68f, 92.74f),
                    PathNode.LineTo(154.0f, 44.27f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 104.0f),
                    PathNode.LineTo(206.0f, 152.0f),
                    PathNode.CurveTo(206.0f, 155.3137f, 203.3137f, 158.0f, 200.0f, 158.0f),
                    PathNode.CurveTo(196.6863f, 158.0f, 194.0f, 155.3137f, 194.0f, 152.0f),
                    PathNode.LineTo(194.0f, 104.0f),
                    PathNode.CurveTo(194.0f, 100.686295f, 196.6863f, 98.0f, 200.0f, 98.0f),
                    PathNode.CurveTo(203.3137f, 98.0f, 206.0f, 100.686295f, 206.0f, 104.0f),
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
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null
