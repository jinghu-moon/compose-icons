package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMonday: ImageVector
    get() {
        if (_brandMonday != null) return _brandMonday!!
        _brandMonday = tablerOutlineIcon(
            name = "BrandMonday",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 15.5f),
                    PathNode.CurveTo(18.0f, 16.328426f, 18.671574f, 17.0f, 19.5f, 17.0f),
                    PathNode.CurveTo(20.328426f, 17.0f, 21.0f, 16.328426f, 21.0f, 15.5f),
                    PathNode.CurveTo(21.0f, 14.671573f, 20.328426f, 14.0f, 19.5f, 14.0f),
                    PathNode.CurveTo(18.671574f, 14.0f, 18.0f, 14.671573f, 18.0f, 15.5f)
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
                    PathNode.MoveTo(9.5f, 7.0f),
                    PathNode.CurveTo(10.02118f, 6.999838f, 10.505089f, 7.270218f, 10.778135f, 7.714149f),
                    PathNode.CurveTo(11.051183f, 8.158079f, 11.074226f, 8.711922f, 10.839f, 9.177f),
                    PathNode.LineTo(6.805f, 16.251f),
                    PathNode.CurveTo(6.541f, 16.698f, 6.055f, 17.0f, 5.5f, 17.0f),
                    PathNode.CurveTo(4.954244f, 17.000093f, 4.451501f, 16.703758f, 4.187271f, 16.226233f),
                    PathNode.CurveTo(3.92304f, 15.748704f, 3.939021f, 15.165344f, 4.229f, 14.703f),
                    PathNode.LineTo(8.135f, 7.876f),
                    PathNode.CurveTo(8.379296f, 7.341977f, 8.912751f, 6.999627f, 9.5f, 7.0f)
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
                    PathNode.MoveTo(16.5f, 7.0f),
                    PathNode.CurveTo(17.021181f, 6.999838f, 17.505089f, 7.270218f, 17.778135f, 7.714149f),
                    PathNode.CurveTo(18.051182f, 8.158079f, 18.074226f, 8.711922f, 17.839f, 9.177f),
                    PathNode.LineTo(13.805f, 16.251f),
                    PathNode.CurveTo(13.541f, 16.698f, 13.055f, 17.0f, 12.5f, 17.0f),
                    PathNode.CurveTo(11.954244f, 17.000093f, 11.451501f, 16.703758f, 11.18727f, 16.226233f),
                    PathNode.CurveTo(10.92304f, 15.748704f, 10.939021f, 15.165344f, 11.229f, 14.703f),
                    PathNode.LineTo(15.135f, 7.876f),
                    PathNode.CurveTo(15.379295f, 7.341977f, 15.912751f, 6.999627f, 16.5f, 7.0f)
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
        return _brandMonday!!
    }

private var _brandMonday: ImageVector? = null
