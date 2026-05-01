package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorLightIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 91.75f),
                    PathNode.LineTo(164.0f, 35.56f),
                    PathNode.CurveTo(162.90833f, 34.55863f, 161.4814f, 34.00212f, 160.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 160.0f),
                    PathNode.CurveTo(33.998745f, 161.59422f, 34.632008f, 163.12341f, 35.76f, 164.25f),
                    PathNode.LineTo(91.76f, 220.25f),
                    PathNode.CurveTo(92.88577f, 221.37187f, 94.410675f, 222.00125f, 96.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 96.0f),
                    PathNode.CurveTo(222.00125f, 94.40577f, 221.368f, 92.87659f, 220.24f, 91.75f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 54.48f),
                    PathNode.LineTo(201.52f, 90.0f),
                    PathNode.LineTo(166.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 201.48f),
                    PathNode.LineTo(54.48f, 166.0f),
                    PathNode.LineTo(90.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.LineTo(46.0f, 54.48f),
                    PathNode.LineTo(90.0f, 98.48f),
                    PathNode.Close,
                    PathNode.MoveTo(54.48f, 46.0f),
                    PathNode.LineTo(154.0f, 46.0f),
                    PathNode.LineTo(154.0f, 90.0f),
                    PathNode.LineTo(98.48f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 102.0f),
                    PathNode.LineTo(154.0f, 154.0f),
                    PathNode.LineTo(102.0f, 154.0f),
                    PathNode.LineTo(102.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 210.0f),
                    PathNode.LineTo(102.0f, 166.0f),
                    PathNode.LineTo(157.52f, 166.0f),
                    PathNode.LineTo(201.52f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 201.52f),
                    PathNode.LineTo(166.0f, 157.52f),
                    PathNode.LineTo(166.0f, 102.0f),
                    PathNode.LineTo(210.0f, 102.0f),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
