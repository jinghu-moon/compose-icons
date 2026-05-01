package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobePremiere: ImageVector
    get() {
        if (_brandAdobePremiere != null) return _brandAdobePremiere!!
        _brandAdobePremiere = tablerOutlineIcon(
            name = "BrandAdobePremiere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.757f, 3.0f, 5.636f, 4.318f, 4.318f),
                    PathNode.CurveTo(5.636f, 3.0f, 7.758f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.242f, 3.0f, 18.364f, 3.0f, 19.682f, 4.318f),
                    PathNode.CurveTo(21.0f, 5.636f, 21.0f, 7.758f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.242f, 21.0f, 18.364f, 19.682f, 19.682f),
                    PathNode.CurveTo(18.364f, 21.0f, 16.242f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.758f, 21.0f, 5.636f, 21.0f, 4.318f, 19.682f),
                    PathNode.CurveTo(3.0f, 18.364f, 3.0f, 16.242f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(7.263f, 15.79f),
                    PathNode.LineTo(7.263f, 12.0f),
                    PathNode.MoveTo(7.263f, 12.0f),
                    PathNode.LineTo(7.263f, 8.752f),
                    PathNode.CurveTo(7.263f, 8.417f, 7.485f, 8.211001f, 7.805f, 8.211001f),
                    PathNode.LineTo(9.158f, 8.211001f),
                    PathNode.CurveTo(9.845216f, 8.195211f, 10.487096f, 8.552807f, 10.835343f, 9.145461f),
                    PathNode.CurveTo(11.183591f, 9.738115f, 11.183591f, 10.472884f, 10.835343f, 11.065538f),
                    PathNode.CurveTo(10.487096f, 11.658194f, 9.845216f, 12.01579f, 9.158f, 12.0f),
                    PathNode.LineTo(7.263f, 12.0f)
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
                    PathNode.MoveTo(13.895f, 10.579f),
                    PathNode.LineTo(13.895f, 12.474f),
                    PathNode.MoveTo(13.895f, 12.474f),
                    PathNode.LineTo(13.895f, 15.789f),
                    PathNode.MoveTo(13.895f, 12.474f),
                    PathNode.CurveTo(14.426f, 11.765f, 14.921f, 10.882f, 15.789f, 10.642f),
                    PathNode.QuadTo(16.009f, 10.58f, 16.263f, 10.579f)
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
        return _brandAdobePremiere!!
    }

private var _brandAdobePremiere: ImageVector? = null
