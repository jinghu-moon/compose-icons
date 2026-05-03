package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWhatsapp: ImageVector
    get() {
        if (_brandWhatsapp != null) return _brandWhatsapp!!
        _brandWhatsapp = tablerOutlineIcon(
            name = "BrandWhatsapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(4.65f, 17.2f),
                    PathNode.CurveTo(2.038182f, 13.492414f, 2.593035f, 8.420691f, 5.944708f, 5.365519f),
                    PathNode.CurveTo(9.296381f, 2.310346f, 14.397671f, 2.226286f, 17.848185f, 5.169371f),
                    PathNode.CurveTo(21.298698f, 8.112456f, 22.02035f, 13.163142f, 19.532104f, 16.95477f),
                    PathNode.CurveTo(17.043861f, 20.746399f, 12.123152f, 22.0943f, 8.05f, 20.1f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 10.276142f, 9.223858f, 10.5f, 9.5f, 10.5f),
                    PathNode.CurveTo(9.776142f, 10.5f, 10.0f, 10.276142f, 10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 8.723858f, 9.776142f, 8.5f, 9.5f, 8.5f),
                    PathNode.CurveTo(9.223858f, 8.5f, 9.0f, 8.723858f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 12.761424f, 11.238576f, 15.0f, 14.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.276142f, 15.0f, 15.5f, 14.776142f, 15.5f, 14.5f),
                    PathNode.CurveTo(15.5f, 14.223858f, 15.276142f, 14.0f, 15.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(13.723858f, 14.0f, 13.5f, 14.223858f, 13.5f, 14.5f),
                    PathNode.CurveTo(13.5f, 14.776142f, 13.723858f, 15.0f, 14.0f, 15.0f)
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
        return _brandWhatsapp!!
    }

private var _brandWhatsapp: ImageVector? = null
