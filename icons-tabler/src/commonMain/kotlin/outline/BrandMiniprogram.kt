package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMiniprogram: ImageVector
    get() {
        if (_brandMiniprogram != null) return _brandMiniprogram!!
        _brandMiniprogram = tablerOutlineIcon(
            name = "BrandMiniprogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 11.503f),
                    PathNode.CurveTo(7.059479f, 12.20839f, 6.737519f, 13.47379f, 7.226546f, 14.542906f),
                    PathNode.CurveTo(7.715572f, 15.612021f, 8.88344f, 16.195955f, 10.032148f, 15.945707f),
                    PathNode.CurveTo(11.180857f, 15.695459f, 12.0f, 14.678651f, 12.0f, 13.503f),
                    PathNode.LineTo(12.0f, 10.503f),
                    PathNode.CurveTo(12.0f, 9.327349f, 12.819143f, 8.310541f, 13.967852f, 8.060293f),
                    PathNode.CurveTo(15.11656f, 7.810045f, 16.284428f, 8.393978f, 16.773455f, 9.463095f),
                    PathNode.CurveTo(17.262482f, 10.53221f, 16.940521f, 11.797609f, 16.0f, 12.503f)
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
        return _brandMiniprogram!!
    }

private var _brandMiniprogram: ImageVector? = null
