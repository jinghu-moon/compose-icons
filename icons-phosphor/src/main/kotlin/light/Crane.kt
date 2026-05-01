package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorLightIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.09f, 18.86f),
                    PathNode.CurveTo(225.28305f, 17.775585f, 223.03964f, 17.718649f, 221.18f, 18.71f),
                    PathNode.LineTo(102.5f, 82.0f),
                    PathNode.LineTo(32.0f, 82.0f),
                    PathNode.CurveTo(24.268015f, 82.0f, 18.0f, 88.26801f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 200.0f),
                    PathNode.CurveTo(18.0f, 207.73198f, 24.268015f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(120.0f, 214.0f),
                    PathNode.CurveTo(127.73199f, 214.0f, 134.0f, 207.73198f, 134.0f, 200.0f),
                    PathNode.LineTo(134.0f, 168.0f),
                    PathNode.CurveTo(133.9968f, 167.41785f, 133.91266f, 166.83897f, 133.75f, 166.28f),
                    PathNode.LineTo(111.16f, 91.0f),
                    PathNode.LineTo(218.0f, 34.0f),
                    PathNode.LineTo(218.0f, 160.0f),
                    PathNode.CurveTo(218.0f, 161.10457f, 217.10457f, 162.0f, 216.0f, 162.0f),
                    PathNode.LineTo(200.0f, 162.0f),
                    PathNode.CurveTo(198.89543f, 162.0f, 198.0f, 161.10457f, 198.0f, 160.0f),
                    PathNode.LineTo(198.0f, 152.0f),
                    PathNode.CurveTo(198.0f, 148.6863f, 195.3137f, 146.0f, 192.0f, 146.0f),
                    PathNode.CurveTo(188.6863f, 146.0f, 186.0f, 148.6863f, 186.0f, 152.0f),
                    PathNode.LineTo(186.0f, 160.0f),
                    PathNode.CurveTo(186.0f, 167.73198f, 192.26802f, 174.0f, 200.0f, 174.0f),
                    PathNode.LineTo(216.0f, 174.0f),
                    PathNode.CurveTo(223.73198f, 174.0f, 230.0f, 167.73198f, 230.0f, 160.0f),
                    PathNode.LineTo(230.0f, 24.0f),
                    PathNode.CurveTo(229.9989f, 21.8948f, 228.89456f, 19.944178f, 227.09f, 18.86f),
                    PathNode.Close,
                    PathNode.MoveTo(99.54f, 94.0f),
                    PathNode.LineTo(119.94f, 162.0f),
                    PathNode.LineTo(62.0f, 162.0f),
                    PathNode.LineTo(62.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 94.0f),
                    PathNode.LineTo(50.0f, 94.0f),
                    PathNode.LineTo(50.0f, 162.0f),
                    PathNode.LineTo(30.0f, 162.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 94.89543f, 30.89543f, 94.0f, 32.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(30.89543f, 202.0f, 30.0f, 201.10457f, 30.0f, 200.0f),
                    PathNode.LineTo(30.0f, 174.0f),
                    PathNode.LineTo(122.0f, 174.0f),
                    PathNode.LineTo(122.0f, 200.0f),
                    PathNode.CurveTo(122.0f, 201.10457f, 121.10457f, 202.0f, 120.0f, 202.0f),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
