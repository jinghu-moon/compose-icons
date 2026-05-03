package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCake: ImageVector
    get() {
        if (_brandCake != null) return _brandCake!!
        _brandCake = tablerOutlineIcon(
            name = "BrandCake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.84f, 12.0f),
                    PathNode.CurveTo(20.84f, 14.05f, 21.825f, 15.225f, 20.8f, 17.0f),
                    PathNode.CurveTo(19.774f, 18.775f, 18.263f, 18.51f, 16.486f, 19.534f),
                    PathNode.CurveTo(14.71f, 20.56f, 14.184f, 22.0f, 12.133f, 22.0f),
                    PathNode.CurveTo(10.082f, 22.0f, 9.557f, 20.559f, 7.78f, 19.534f),
                    PathNode.CurveTo(6.004f, 18.51f, 4.492f, 18.775f, 3.466f, 17.0f),
                    PathNode.CurveTo(2.441f, 15.225f, 3.426f, 14.05f, 3.426f, 12.0f),
                    PathNode.CurveTo(3.426f, 9.95f, 2.441f, 8.775f, 3.466f, 7.0f),
                    PathNode.CurveTo(4.492f, 5.225f, 6.003f, 5.49f, 7.78f, 4.466f),
                    PathNode.CurveTo(9.556f, 3.44f, 10.082f, 2.0f, 12.133f, 2.0f),
                    PathNode.CurveTo(14.184f, 2.0f, 14.71f, 3.441f, 16.486f, 4.466f),
                    PathNode.CurveTo(18.262f, 5.49f, 19.774f, 5.225f, 20.799f, 7.0f),
                    PathNode.CurveTo(21.825f, 8.775f, 20.839f, 9.95f, 20.839f, 12.0f),
                    PathNode.LineTo(20.84f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandCake!!
    }

private var _brandCake: ImageVector? = null
