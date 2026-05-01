package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMastercard: ImageVector
    get() {
        if (_brandMastercard != null) return _brandMastercard!!
        _brandMastercard = tablerOutlineIcon(
            name = "BrandMastercard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 13.656855f, 12.343145f, 15.0f, 14.0f, 15.0f),
                    PathNode.CurveTo(15.656855f, 15.0f, 17.0f, 13.656855f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 10.343145f, 15.656855f, 9.0f, 14.0f, 9.0f),
                    PathNode.CurveTo(12.343145f, 9.0f, 11.0f, 10.343145f, 11.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 9.765f),
                    PathNode.CurveTo(10.797606f, 8.68839f, 8.958929f, 8.756006f, 7.838859f, 9.918023f),
                    PathNode.CurveTo(6.718789f, 11.08004f, 6.718789f, 12.91996f, 7.838859f, 14.081977f),
                    PathNode.CurveTo(8.958929f, 15.243994f, 10.797606f, 15.31161f, 12.0f, 14.235f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 5.895431f, 3.895431f, 5.0f, 5.0f, 5.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.10457f, 5.0f, 21.0f, 5.895431f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 18.10457f, 20.10457f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.895431f, 19.0f, 3.0f, 18.10457f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandMastercard!!
    }

private var _brandMastercard: ImageVector? = null
