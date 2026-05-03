package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCashapp: ImageVector
    get() {
        if (_brandCashapp != null) return _brandCashapp!!
        _brandCashapp = tablerOutlineIcon(
            name = "BrandCashapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.1f, 8.648f),
                    PathNode.CurveTo(16.886658f, 8.846198f, 16.557983f, 8.850949f, 16.339f, 8.659f),
                    PathNode.CurveTo(15.315408f, 7.795007f, 14.019486f, 7.320413f, 12.68f, 7.319f),
                    PathNode.CurveTo(11.578f, 7.319f, 10.475f, 7.682f, 10.475f, 8.693f),
                    PathNode.CurveTo(10.475f, 9.716f, 11.657f, 10.057f, 13.021f, 10.568f),
                    PathNode.CurveTo(15.407f, 11.364f, 17.384f, 12.364f, 17.384f, 14.705f),
                    PathNode.CurveTo(17.384f, 17.25f, 15.407f, 19.0f, 12.18f, 19.193f),
                    PathNode.LineTo(11.885f, 20.557f),
                    PathNode.CurveTo(11.830972f, 20.815393f, 11.602982f, 21.000374f, 11.339f, 21.0f),
                    PathNode.LineTo(9.305f, 21.0f),
                    PathNode.LineTo(9.203f, 20.989f),
                    PathNode.CurveTo(8.900137f, 20.921198f, 8.707769f, 20.62285f, 8.771f, 20.319f),
                    PathNode.LineTo(9.089f, 18.875f),
                    PathNode.CurveTo(7.864162f, 18.568035f, 6.737732f, 17.954056f, 5.816f, 17.091f),
                    PathNode.LineTo(5.816f, 17.08f),
                    PathNode.CurveTo(5.713102f, 16.977703f, 5.655243f, 16.838596f, 5.655243f, 16.6935f),
                    PathNode.CurveTo(5.655243f, 16.548405f, 5.713102f, 16.409298f, 5.816f, 16.307f),
                    PathNode.LineTo(6.953f, 15.205f),
                    PathNode.CurveTo(7.167f, 15.005f, 7.5f, 15.005f, 7.714f, 15.205f),
                    PathNode.CurveTo(8.753819f, 16.187311f, 10.135706f, 16.72543f, 11.566f, 16.705f),
                    PathNode.CurveTo(13.044f, 16.705f, 14.032f, 16.08f, 14.032f, 15.091f),
                    PathNode.CurveTo(14.032f, 14.102f, 13.032f, 13.841f, 11.146f, 13.137f),
                    PathNode.CurveTo(9.146f, 12.421f, 7.248f, 11.409f, 7.248f, 9.046f),
                    PathNode.CurveTo(7.248f, 6.296f, 9.532f, 4.955f, 12.237f, 4.83f),
                    PathNode.LineTo(12.521f, 3.432f),
                    PathNode.CurveTo(12.575249f, 3.175742f, 12.804125f, 2.994321f, 13.066f, 3.0f),
                    PathNode.LineTo(15.089f, 3.0f),
                    PathNode.LineTo(15.203f, 3.012f),
                    PathNode.CurveTo(15.344687f, 3.041751f, 15.468671f, 3.126754f, 15.547501f, 3.248189f),
                    PathNode.CurveTo(15.62633f, 3.369624f, 15.653502f, 3.517472f, 15.623f, 3.659f),
                    PathNode.LineTo(15.316f, 5.216f),
                    PathNode.CurveTo(16.347425f, 5.558304f, 17.303919f, 6.094592f, 18.134f, 6.796f),
                    PathNode.LineTo(18.157f, 6.818f),
                    PathNode.CurveTo(18.373f, 7.046f, 18.373f, 7.387f, 18.157f, 7.591f),
                    PathNode.LineTo(17.1f, 8.648f)
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
        return _brandCashapp!!
    }

private var _brandCashapp: ImageVector? = null
