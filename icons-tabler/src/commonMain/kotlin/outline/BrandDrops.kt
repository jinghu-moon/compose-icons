package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrops: ImageVector
    get() {
        if (_brandDrops != null) return _brandDrops!!
        _brandDrops = tablerOutlineIcon(
            name = "BrandDrops",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.637f, 7.416f),
                    PathNode.CurveTo(19.935102f, 9.675955f, 20.631437f, 13.104612f, 19.397f, 16.082f),
                    PathNode.CurveTo(18.151537f, 19.06535f, 15.232881f, 21.005857f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.767483f, 21.005453f, 5.849324f, 19.065012f, 4.604f, 16.082f),
                    PathNode.CurveTo(3.369312f, 13.104812f, 4.065245f, 9.676184f, 6.363f, 7.416f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(17.637f, 7.416f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.466f, 10.923f),
                    PathNode.CurveTo(15.473847f, 11.945617f, 15.776572f, 13.469856f, 15.236f, 14.8f),
                    PathNode.CurveTo(14.706295f, 16.124136f, 13.426146f, 16.994448f, 12.0f, 17.0f),
                    PathNode.CurveTo(10.573854f, 16.994448f, 9.293705f, 16.124136f, 8.764f, 14.8f),
                    PathNode.CurveTo(8.223428f, 13.469856f, 8.526153f, 11.945617f, 9.534f, 10.923f),
                    PathNode.LineTo(12.0f, 8.5f),
                    PathNode.LineTo(14.466f, 10.923f)
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
        return _brandDrops!!
    }

private var _brandDrops: ImageVector? = null
