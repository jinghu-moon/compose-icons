package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorLightIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 188.24f),
                    PathNode.LineTo(196.24f, 220.24f),
                    PathNode.CurveTo(193.89746f, 222.57962f, 190.10254f, 222.57962f, 187.76f, 220.24f),
                    PathNode.LineTo(155.76f, 188.24f),
                    PathNode.CurveTo(153.55713f, 185.87592f, 153.62213f, 182.19193f, 155.90703f, 179.90703f),
                    PathNode.CurveTo(158.19193f, 177.62213f, 161.87592f, 177.55713f, 164.24f, 179.76f),
                    PathNode.LineTo(186.0f, 201.51f),
                    PathNode.LineTo(186.0f, 138.51f),
                    PathNode.LineTo(128.0f, 80.51f),
                    PathNode.LineTo(70.0f, 138.51f),
                    PathNode.LineTo(70.0f, 201.51f),
                    PathNode.LineTo(91.76f, 179.76f),
                    PathNode.CurveTo(94.12408f, 177.55713f, 97.808075f, 177.62213f, 100.09297f, 179.90703f),
                    PathNode.CurveTo(102.37787f, 182.19193f, 102.44287f, 185.87592f, 100.24f, 188.24f),
                    PathNode.LineTo(68.24f, 220.24f),
                    PathNode.CurveTo(65.89746f, 222.57962f, 62.10254f, 222.57962f, 59.76f, 220.24f),
                    PathNode.LineTo(27.76f, 188.24f),
                    PathNode.CurveTo(25.557129f, 185.87592f, 25.62213f, 182.19193f, 27.907026f, 179.90703f),
                    PathNode.CurveTo(30.191923f, 177.62213f, 33.875923f, 177.55713f, 36.24f, 179.76f),
                    PathNode.LineTo(58.0f, 201.51f),
                    PathNode.LineTo(58.0f, 136.0f),
                    PathNode.CurveTo(58.0014f, 134.40924f, 58.63446f, 132.88414f, 59.76f, 131.76f),
                    PathNode.LineTo(122.0f, 69.51f),
                    PathNode.LineTo(122.0f, 24.0f),
                    PathNode.CurveTo(122.0f, 20.68629f, 124.686295f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(131.3137f, 18.0f, 134.0f, 20.68629f, 134.0f, 24.0f),
                    PathNode.LineTo(134.0f, 69.51f),
                    PathNode.LineTo(196.24f, 131.76f),
                    PathNode.CurveTo(197.36554f, 132.88414f, 197.9986f, 134.40924f, 198.0f, 136.0f),
                    PathNode.LineTo(198.0f, 201.51f),
                    PathNode.LineTo(219.76f, 179.76f),
                    PathNode.CurveTo(222.12408f, 177.55713f, 225.80807f, 177.62213f, 228.09297f, 179.90703f),
                    PathNode.CurveTo(230.37787f, 182.19193f, 230.44287f, 185.87592f, 228.24f, 188.24f),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
