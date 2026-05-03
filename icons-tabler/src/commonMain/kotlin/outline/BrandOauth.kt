package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOauth: ImageVector
    get() {
        if (_brandOauth != null) return _brandOauth!!
        _brandOauth = tablerOutlineIcon(
            name = "BrandOauth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 17.522848f, 6.477153f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(17.522848f, 22.0f, 22.0f, 17.522848f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 6.477153f, 17.522848f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(6.477153f, 2.0f, 2.0f, 6.477153f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(12.556f, 6.0f),
                    PathNode.CurveTo(13.206f, 6.0f, 13.791f, 6.373f, 14.064f, 6.947f),
                    PathNode.LineTo(16.903f, 14.795f),
                    PathNode.CurveTo(17.050514f, 15.208391f, 17.02681f, 15.663578f, 16.837154f, 16.05941f),
                    PathNode.CurveTo(16.647501f, 16.455244f, 16.307606f, 16.758936f, 15.893f, 16.903f),
                    PathNode.CurveTo(15.087486f, 17.189375f, 14.195652f, 16.822376f, 13.825f, 16.052f),
                    PathNode.LineTo(13.365f, 15.0f),
                    PathNode.LineTo(10.635f, 15.0f),
                    PathNode.LineTo(10.237f, 15.905f),
                    PathNode.CurveTo(9.94289f, 16.708254f, 9.089377f, 17.1594f, 8.26f, 16.95f),
                    PathNode.LineTo(8.107001f, 16.903f),
                    PathNode.CurveTo(7.301755f, 16.62264f, 6.843621f, 15.774052f, 7.051f, 14.947f),
                    PathNode.LineTo(9.875f, 7.095f),
                    PathNode.CurveTo(10.095194f, 6.490864f, 10.643761f, 6.067662f, 11.284f, 6.008f),
                    PathNode.LineTo(12.556f, 6.0f)
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
        return _brandOauth!!
    }

private var _brandOauth: ImageVector? = null
