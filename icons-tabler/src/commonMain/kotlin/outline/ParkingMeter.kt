package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) return _parkingMeter!!
        _parkingMeter = tablerOutlineIcon(
            name = "ParkingMeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 7.343146f, 13.656855f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(10.343145f, 6.0f, 9.0f, 7.343146f, 9.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(10.938f, 19.0f),
                    PathNode.LineTo(13.06f, 19.0f),
                    PathNode.CurveTo(14.827369f, 19.007261f, 16.3943f, 17.864876f, 16.928f, 16.18f),
                    PathNode.LineTo(18.703f, 10.5f),
                    PathNode.CurveTo(19.785f, 7.037f, 17.821f, 3.362f, 14.317f, 2.292f),
                    PathNode.CurveTo(13.681752f, 2.098054f, 13.021195f, 1.999644f, 12.357f, 2.0f),
                    PathNode.LineTo(11.641f, 2.0f),
                    PathNode.CurveTo(7.973f, 2.0f, 5.0f, 4.939f, 5.0f, 8.563f),
                    PathNode.CurveTo(5.0f, 9.22f, 5.1f, 9.873f, 5.296f, 10.5f),
                    PathNode.LineTo(7.071f, 16.18f),
                    PathNode.CurveTo(7.60459f, 17.864523f, 9.171f, 19.006824f, 10.938f, 19.0f)
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
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
