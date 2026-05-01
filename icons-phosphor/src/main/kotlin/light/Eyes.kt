package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorLightIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 34.0f),
                    PathNode.CurveTo(154.85f, 34.0f, 136.9f, 54.15f, 128.0f, 84.26f),
                    PathNode.CurveTo(119.1f, 54.15f, 101.15f, 34.0f, 80.0f, 34.0f),
                    PathNode.CurveTo(49.72f, 34.0f, 26.0f, 75.29f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 180.71f, 49.72f, 222.0f, 80.0f, 222.0f),
                    PathNode.CurveTo(101.15f, 222.0f, 119.1f, 201.85f, 128.0f, 171.74f),
                    PathNode.CurveTo(136.9f, 201.85f, 154.85f, 222.0f, 176.0f, 222.0f),
                    PathNode.CurveTo(206.28f, 222.0f, 230.0f, 180.71f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 75.29f, 206.28f, 34.0f, 176.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 210.0f),
                    PathNode.CurveTo(61.76f, 210.0f, 45.81f, 185.9f, 40.17f, 153.47f),
                    PathNode.CurveTo(52.743073f, 161.29512f, 69.14508f, 158.77489f, 78.78891f, 147.53606f),
                    PathNode.CurveTo(88.43275f, 136.29726f, 88.43275f, 119.70275f, 78.78891f, 108.46393f),
                    PathNode.CurveTo(69.14508f, 97.22511f, 52.743073f, 94.70489f, 40.17f, 102.53f),
                    PathNode.CurveTo(45.81f, 70.1f, 61.76f, 46.0f, 80.0f, 46.0f),
                    PathNode.CurveTo(102.77f, 46.0f, 122.0f, 83.55f, 122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 172.45f, 102.77f, 210.0f, 80.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 118.05888f, 46.058876f, 110.0f, 56.0f, 110.0f),
                    PathNode.CurveTo(65.941124f, 110.0f, 74.0f, 118.05888f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 137.94113f, 65.941124f, 146.0f, 56.0f, 146.0f),
                    PathNode.CurveTo(46.058876f, 146.0f, 38.0f, 137.94113f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 210.0f),
                    PathNode.CurveTo(157.76f, 210.0f, 141.81f, 185.9f, 136.17f, 153.47f),
                    PathNode.CurveTo(148.74307f, 161.29512f, 165.14508f, 158.77489f, 174.78891f, 147.53606f),
                    PathNode.CurveTo(184.43274f, 136.29726f, 184.43274f, 119.70275f, 174.78891f, 108.46393f),
                    PathNode.CurveTo(165.14508f, 97.22511f, 148.74307f, 94.70489f, 136.17f, 102.53f),
                    PathNode.CurveTo(141.81f, 70.1f, 157.76f, 46.0f, 176.0f, 46.0f),
                    PathNode.CurveTo(198.77f, 46.0f, 218.0f, 83.55f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 172.45f, 198.77f, 210.0f, 176.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 128.0f),
                    PathNode.CurveTo(134.0f, 118.05888f, 142.05887f, 110.0f, 152.0f, 110.0f),
                    PathNode.CurveTo(161.94113f, 110.0f, 170.0f, 118.05888f, 170.0f, 128.0f),
                    PathNode.CurveTo(170.0f, 137.94113f, 161.94113f, 146.0f, 152.0f, 146.0f),
                    PathNode.CurveTo(142.05887f, 146.0f, 134.0f, 137.94113f, 134.0f, 128.0f),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
