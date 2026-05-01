package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorLightIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(126.0f, 128.0f),
                    PathNode.CurveTo(126.0019f, 129.82407f, 125.17392f, 131.54996f, 123.75f, 132.69f),
                    PathNode.LineTo(83.75f, 164.69f),
                    PathNode.CurveTo(81.15978f, 166.76106f, 77.381065f, 166.34021f, 75.31f, 163.75f),
                    PathNode.CurveTo(73.23893f, 161.15979f, 73.65978f, 157.38107f, 76.25f, 155.31f),
                    PathNode.LineTo(110.4f, 128.0f),
                    PathNode.LineTo(76.25f, 100.69f),
                    PathNode.CurveTo(73.65978f, 98.618935f, 73.23893f, 94.84022f, 75.31f, 92.25f),
                    PathNode.CurveTo(77.381065f, 89.65978f, 81.15978f, 89.23893f, 83.75f, 91.31f),
                    PathNode.LineTo(123.75f, 123.31f),
                    PathNode.CurveTo(125.17392f, 124.45004f, 126.0019f, 126.17593f, 126.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 154.0f),
                    PathNode.LineTo(136.0f, 154.0f),
                    PathNode.CurveTo(132.6863f, 154.0f, 130.0f, 156.6863f, 130.0f, 160.0f),
                    PathNode.CurveTo(130.0f, 163.3137f, 132.6863f, 166.0f, 136.0f, 166.0f),
                    PathNode.LineTo(176.0f, 166.0f),
                    PathNode.CurveTo(179.3137f, 166.0f, 182.0f, 163.3137f, 182.0f, 160.0f),
                    PathNode.CurveTo(182.0f, 156.6863f, 179.3137f, 154.0f, 176.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 207.73198f, 223.73198f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(40.0f, 214.0f),
                    PathNode.CurveTo(32.268013f, 214.0f, 26.0f, 207.73198f, 26.0f, 200.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 200.0f),
                    PathNode.CurveTo(38.0f, 201.10457f, 38.89543f, 202.0f, 40.0f, 202.0f),
                    PathNode.LineTo(216.0f, 202.0f),
                    PathNode.CurveTo(217.10457f, 202.0f, 218.0f, 201.10457f, 218.0f, 200.0f),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
