package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorLightIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.47f, 70.73f),
                    PathNode.CurveTo(231.79193f, 67.71667f, 227.9514f, 65.99479f, 223.92f, 66.0f),
                    PathNode.LineTo(174.0f, 66.0f),
                    PathNode.LineTo(174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 38.594906f, 153.4051f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(102.5949f, 18.0f, 82.0f, 38.594906f, 82.0f, 64.0f),
                    PathNode.LineTo(82.0f, 66.0f),
                    PathNode.LineTo(32.08f, 66.0f),
                    PathNode.CurveTo(28.064537f, 65.97234f, 24.23051f, 67.67024f, 21.552286f, 70.6622f),
                    PathNode.CurveTo(18.874063f, 73.65416f, 17.60951f, 77.6521f, 18.08f, 81.64f),
                    PathNode.LineTo(32.33f, 201.64f),
                    PathNode.CurveTo(33.19135f, 208.71187f, 39.2059f, 214.02187f, 46.33f, 214.0f),
                    PathNode.LineTo(209.67f, 214.0f),
                    PathNode.CurveTo(216.7941f, 214.02187f, 222.80865f, 208.71187f, 223.67f, 201.64f),
                    PathNode.LineTo(237.92f, 81.64f),
                    PathNode.CurveTo(238.3765f, 77.67793f, 237.1215f, 73.70924f, 234.47f, 70.73f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 64.0f),
                    PathNode.CurveTo(94.0f, 45.222317f, 109.22232f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(146.77768f, 30.0f, 162.0f, 45.222317f, 162.0f, 64.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(94.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.73f, 200.23f),
                    PathNode.CurveTo(211.61063f, 201.26727f, 210.71342f, 202.03818f, 209.67f, 202.0f),
                    PathNode.LineTo(46.33f, 202.0f),
                    PathNode.CurveTo(45.286583f, 202.03818f, 44.389374f, 201.26727f, 44.27f, 200.23f),
                    PathNode.LineTo(30.0f, 80.23f),
                    PathNode.CurveTo(29.931856f, 79.6729f, 30.110891f, 79.11387f, 30.49f, 78.7f),
                    PathNode.CurveTo(30.889421f, 78.24747f, 31.466463f, 77.99182f, 32.07f, 78.0f),
                    PathNode.LineTo(82.0f, 78.0f),
                    PathNode.LineTo(82.0f, 104.0f),
                    PathNode.CurveTo(82.0f, 107.313705f, 84.686295f, 110.0f, 88.0f, 110.0f),
                    PathNode.CurveTo(91.313705f, 110.0f, 94.0f, 107.313705f, 94.0f, 104.0f),
                    PathNode.LineTo(94.0f, 78.0f),
                    PathNode.LineTo(162.0f, 78.0f),
                    PathNode.LineTo(162.0f, 104.0f),
                    PathNode.CurveTo(162.0f, 107.313705f, 164.6863f, 110.0f, 168.0f, 110.0f),
                    PathNode.CurveTo(171.3137f, 110.0f, 174.0f, 107.313705f, 174.0f, 104.0f),
                    PathNode.LineTo(174.0f, 78.0f),
                    PathNode.LineTo(223.92f, 78.0f),
                    PathNode.CurveTo(224.52353f, 77.99182f, 225.10057f, 78.24747f, 225.5f, 78.7f),
                    PathNode.CurveTo(225.8791f, 79.11387f, 226.05812f, 79.6729f, 225.99f, 80.23f),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
