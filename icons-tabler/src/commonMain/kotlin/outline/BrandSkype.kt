package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSkype: ImageVector
    get() {
        if (_brandSkype != null) return _brandSkype!!
        _brandSkype = tablerOutlineIcon(
            name = "BrandSkype",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(14.857057f, 2.999371f, 17.5447f, 4.355325f, 19.241905f, 6.653644f),
                    PathNode.CurveTo(20.93911f, 8.951962f, 21.444244f, 11.919601f, 20.603f, 14.65f),
                    PathNode.CurveTo(21.37308f, 16.355799f, 21.006958f, 18.360159f, 19.68356f, 19.68356f),
                    PathNode.CurveTo(18.360159f, 21.006958f, 16.355799f, 21.37308f, 14.65f, 20.603f),
                    PathNode.CurveTo(11.462238f, 21.586323f, 7.992065f, 20.72572f, 5.633173f, 18.366829f),
                    PathNode.CurveTo(3.274281f, 16.007935f, 2.413678f, 12.537762f, 3.397f, 9.35f),
                    PathNode.CurveTo(2.626247f, 7.644104f, 2.992059f, 5.639221f, 4.315606f, 4.315452f),
                    PathNode.CurveTo(5.639154f, 2.991682f, 7.643975f, 2.625534f, 9.35f, 3.396f),
                    PathNode.CurveTo(10.208583f, 3.132321f, 11.101841f, 2.998838f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 14.5f),
                    PathNode.CurveTo(8.5f, 16.5f, 10.358f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(14.905f, 17.0f, 16.0f, 15.813f, 16.0f, 14.5f),
                    PathNode.CurveTo(16.0f, 12.997f, 14.073f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(9.927f, 12.0f, 8.0f, 11.0f, 8.0f, 9.5f),
                    PathNode.CurveTo(8.0f, 8.187001f, 9.095f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.642f, 7.0f, 15.5f, 7.5f, 16.0f, 9.5f)
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
        return _brandSkype!!
    }

private var _brandSkype: ImageVector? = null
