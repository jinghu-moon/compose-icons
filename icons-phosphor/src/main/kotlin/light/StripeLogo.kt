package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorLightIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 168.54f, 148.95f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(107.05f, 182.0f, 90.0f, 168.54f, 90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 148.6863f, 92.686295f, 146.0f, 96.0f, 146.0f),
                    PathNode.CurveTo(99.313705f, 146.0f, 102.0f, 148.6863f, 102.0f, 152.0f),
                    PathNode.CurveTo(102.0f, 161.76f, 113.91f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(142.09f, 170.0f, 154.0f, 161.76f, 154.0f, 152.0f),
                    PathNode.CurveTo(154.0f, 140.79f, 143.3f, 136.9f, 125.67f, 131.82f),
                    PathNode.CurveTo(109.78f, 127.24f, 91.78f, 122.05f, 91.78f, 104.0f),
                    PathNode.CurveTo(91.78f, 86.9f, 107.35f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(143.0f, 74.0f, 155.74f, 80.88f, 161.34f, 92.0f),
                    PathNode.CurveTo(162.83669f, 94.95748f, 161.65248f, 98.568306f, 158.695f, 100.065f),
                    PathNode.CurveTo(155.73752f, 101.56169f, 152.1267f, 100.37749f, 150.63f, 97.42f),
                    PathNode.CurveTo(147.08f, 90.36f, 138.41f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(114.19f, 86.0f, 103.78f, 93.74f, 103.78f, 104.0f),
                    PathNode.CurveTo(103.78f, 112.41f, 113.3f, 115.76f, 128.99f, 120.29f),
                    PathNode.CurveTo(145.48f, 125.0f, 166.0f, 131.0f, 166.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 215.73198f, 215.73198f, 222.0f, 208.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 40.268013f, 40.268013f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(48.0f, 46.0f),
                    PathNode.CurveTo(46.89543f, 46.0f, 46.0f, 46.89543f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.LineTo(208.0f, 210.0f),
                    PathNode.CurveTo(209.10457f, 210.0f, 210.0f, 209.10457f, 210.0f, 208.0f),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
