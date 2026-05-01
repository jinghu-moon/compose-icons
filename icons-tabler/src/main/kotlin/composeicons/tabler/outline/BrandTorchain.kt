package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTorchain: ImageVector
    get() {
        if (_brandTorchain != null) return _brandTorchain!!
        _brandTorchain = tablerOutlineIcon(
            name = "BrandTorchain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.588f, 15.537f),
                    PathNode.LineTo(12.035f, 12.0f),
                    PathNode.LineTo(4.293f, 20.18f),
                    PathNode.CurveTo(3.502f, 21.03f, 4.446f, 22.36f, 5.531f, 21.91f),
                    PathNode.LineTo(15.147f, 17.814f),
                    PathNode.CurveTo(15.575065f, 17.632107f, 15.884638f, 17.249237f, 15.972881f, 16.792578f),
                    PathNode.CurveTo(16.061125f, 16.33592f, 15.91648f, 15.865278f, 15.587f, 15.537f)
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
                    PathNode.MoveTo(8.412f, 8.464f),
                    PathNode.LineTo(11.965f, 12.0f),
                    PathNode.LineTo(19.707f, 3.82f),
                    PathNode.CurveTo(20.498f, 2.97f, 19.554f, 1.64f, 18.469f, 2.09f),
                    PathNode.LineTo(8.853f, 6.188f),
                    PathNode.CurveTo(8.424935f, 6.369893f, 8.115362f, 6.752763f, 8.027119f, 7.209422f),
                    PathNode.CurveTo(7.938876f, 7.66608f, 8.08352f, 8.136722f, 8.413f, 8.465f),
                    PathNode.LineTo(8.412f, 8.464f)
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
        return _brandTorchain!!
    }

private var _brandTorchain: ImageVector? = null
