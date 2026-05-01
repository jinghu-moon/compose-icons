package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCodecov: ImageVector
    get() {
        if (_brandCodecov != null) return _brandCodecov!!
        _brandCodecov = tablerOutlineIcon(
            name = "BrandCodecov",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.695f, 12.985f),
                    PathNode.CurveTo(8.71701f, 12.340681f, 7.571157f, 11.998142f, 6.4f, 12.0f),
                    PathNode.CurveTo(5.143f, 12.0f, 3.964f, 12.339f, 3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 8.029437f, 7.029437f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(16.970562f, 4.0f, 21.0f, 8.029437f, 21.0f, 13.0f),
                    PathNode.CurveTo(20.034f, 12.336f, 18.86f, 12.0f, 17.6f, 12.0f),
                    PathNode.CurveTo(15.624879f, 11.999625f, 13.776088f, 12.971332f, 12.65631f, 14.598354f),
                    PathNode.CurveTo(11.536533f, 16.225378f, 11.289223f, 18.299282f, 11.995f, 20.144f)
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
        return _brandCodecov!!
    }

private var _brandCodecov: ImageVector? = null
