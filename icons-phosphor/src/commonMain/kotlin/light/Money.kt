package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorLightIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 166.0f),
                    PathNode.CurveTo(148.98682f, 166.0f, 166.0f, 148.98682f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 107.013176f, 148.98682f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(107.013176f, 90.0f, 90.0f, 107.013176f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 148.98682f, 107.013176f, 166.0f, 128.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 102.0f),
                    PathNode.CurveTo(142.3594f, 102.0f, 154.0f, 113.640594f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 142.3594f, 142.3594f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(113.640594f, 154.0f, 102.0f, 142.3594f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 113.640594f, 113.640594f, 102.0f, 128.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 58.0f),
                    PathNode.LineTo(16.0f, 58.0f),
                    PathNode.CurveTo(12.686292f, 58.0f, 10.0f, 60.68629f, 10.0f, 64.0f),
                    PathNode.LineTo(10.0f, 192.0f),
                    PathNode.CurveTo(10.0f, 195.3137f, 12.686292f, 198.0f, 16.0f, 198.0f),
                    PathNode.LineTo(240.0f, 198.0f),
                    PathNode.CurveTo(243.3137f, 198.0f, 246.0f, 195.3137f, 246.0f, 192.0f),
                    PathNode.LineTo(246.0f, 64.0f),
                    PathNode.CurveTo(246.0f, 60.68629f, 243.3137f, 58.0f, 240.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 108.82f),
                    PathNode.CurveTo(40.96366f, 103.77511f, 55.775105f, 88.96366f, 60.82f, 70.0f),
                    PathNode.LineTo(195.18f, 70.0f),
                    PathNode.CurveTo(200.2249f, 88.96366f, 215.03635f, 103.77511f, 234.0f, 108.82f),
                    PathNode.LineTo(234.0f, 147.18f),
                    PathNode.CurveTo(215.03635f, 152.2249f, 200.2249f, 167.03635f, 195.18f, 186.0f),
                    PathNode.LineTo(60.82f, 186.0f),
                    PathNode.CurveTo(55.775105f, 167.03635f, 40.96366f, 152.2249f, 22.0f, 147.18f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 96.29f),
                    PathNode.CurveTo(221.68924f, 91.9893f, 212.0107f, 82.310776f, 207.71f, 70.0f),
                    PathNode.LineTo(234.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.29f, 70.0f),
                    PathNode.CurveTo(43.989304f, 82.310776f, 34.310772f, 91.9893f, 22.0f, 96.29f),
                    PathNode.LineTo(22.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 159.71f),
                    PathNode.CurveTo(34.310772f, 164.0107f, 43.989304f, 173.68924f, 48.29f, 186.0f),
                    PathNode.LineTo(22.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.71f, 186.0f),
                    PathNode.CurveTo(212.0107f, 173.68924f, 221.68924f, 164.0107f, 234.0f, 159.71f),
                    PathNode.LineTo(234.0f, 186.0f),
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
        return _money!!
    }

private var _money: ImageVector? = null
