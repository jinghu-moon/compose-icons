package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleBigQuery: ImageVector
    get() {
        if (_brandGoogleBigQuery != null) return _brandGoogleBigQuery!!
        _brandGoogleBigQuery = tablerOutlineIcon(
            name = "BrandGoogleBigQuery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.73f, 19.875f),
                    PathNode.CurveTo(17.33201f, 20.5748f, 16.587042f, 21.005032f, 15.782f, 21.0f),
                    PathNode.LineTo(8.499f, 21.0f),
                    PathNode.CurveTo(7.687191f, 20.998652f, 6.940733f, 20.554688f, 6.552f, 19.842f),
                    PathNode.LineTo(2.28f, 13.092f),
                    PathNode.CurveTo(1.906592f, 12.411882f, 1.906592f, 11.588118f, 2.28f, 10.908f),
                    PathNode.LineTo(6.552f, 4.158f),
                    PathNode.CurveTo(6.941044f, 3.446093f, 7.686729f, 3.002361f, 8.498f, 3.0f),
                    PathNode.LineTo(15.783f, 3.0f),
                    PathNode.CurveTo(16.592f, 3.0f, 17.337f, 3.443f, 17.73f, 4.158f),
                    PathNode.LineTo(21.71f, 10.908f),
                    PathNode.CurveTo(22.096119f, 11.608304f, 22.096119f, 12.457696f, 21.71f, 13.158f),
                    PathNode.LineTo(17.73f, 19.908f),
                    PathNode.LineTo(17.73f, 19.875f)
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
                    PathNode.MoveTo(8.0f, 11.5f),
                    PathNode.CurveTo(8.0f, 13.432997f, 9.567003f, 15.0f, 11.5f, 15.0f),
                    PathNode.CurveTo(13.432997f, 15.0f, 15.0f, 13.432997f, 15.0f, 11.5f),
                    PathNode.CurveTo(15.0f, 9.567003f, 13.432997f, 8.0f, 11.5f, 8.0f),
                    PathNode.CurveTo(9.567003f, 8.0f, 8.0f, 9.567003f, 8.0f, 11.5f)
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
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
        return _brandGoogleBigQuery!!
    }

private var _brandGoogleBigQuery: ImageVector? = null
