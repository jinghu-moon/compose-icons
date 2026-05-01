package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorLightIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 104.0f),
                    PathNode.LineTo(182.0f, 136.0f),
                    PathNode.CurveTo(182.0f, 139.3137f, 179.3137f, 142.0f, 176.0f, 142.0f),
                    PathNode.LineTo(94.48f, 142.0f),
                    PathNode.LineTo(108.24f, 155.76f),
                    PathNode.CurveTo(109.84522f, 157.25575f, 110.506f, 159.50844f, 109.96308f, 161.63431f),
                    PathNode.CurveTo(109.42017f, 163.76018f, 107.76018f, 165.42018f, 105.6343f, 165.96309f),
                    PathNode.CurveTo(103.508446f, 166.506f, 101.25577f, 165.84523f, 99.76f, 164.24f),
                    PathNode.LineTo(75.76f, 140.24f),
                    PathNode.CurveTo(73.42038f, 137.89746f, 73.42038f, 134.10254f, 75.76f, 131.76f),
                    PathNode.LineTo(99.76f, 107.76f),
                    PathNode.CurveTo(102.12408f, 105.55713f, 105.808075f, 105.62213f, 108.09297f, 107.90703f),
                    PathNode.CurveTo(110.37787f, 110.191925f, 110.44287f, 113.87592f, 108.24f, 116.24f),
                    PathNode.LineTo(94.48f, 130.0f),
                    PathNode.LineTo(170.0f, 130.0f),
                    PathNode.LineTo(170.0f, 104.0f),
                    PathNode.CurveTo(170.0f, 100.686295f, 172.6863f, 98.0f, 176.0f, 98.0f),
                    PathNode.CurveTo(179.3137f, 98.0f, 182.0f, 100.686295f, 182.0f, 104.0f),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
