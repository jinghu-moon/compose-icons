package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerOutlineIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.349f, 5.349f),
                    PathNode.LineTo(18.65f, 8.65f),
                    PathNode.CurveTo(18.875332f, 8.875082f, 19.001944f, 9.180509f, 19.001944f, 9.499f),
                    PathNode.CurveTo(19.001944f, 9.817492f, 18.875332f, 10.122918f, 18.65f, 10.348f),
                    PathNode.LineTo(17.678f, 11.32f),
                    PathNode.CurveTo(18.676613f, 14.612088f, 17.307447f, 18.161444f, 14.35667f, 19.930054f),
                    PathNode.CurveTo(11.405893f, 21.698664f, 7.630226f, 21.232971f, 5.197628f, 18.800373f),
                    PathNode.CurveTo(2.765029f, 16.367775f, 2.299337f, 12.592107f, 4.067947f, 9.64133f),
                    PathNode.CurveTo(5.836557f, 6.690552f, 9.385912f, 5.321388f, 12.678f, 6.32f),
                    PathNode.LineTo(13.65f, 5.348f),
                    PathNode.CurveTo(13.875082f, 5.122668f, 14.180509f, 4.996056f, 14.499f, 4.996056f),
                    PathNode.CurveTo(14.817492f, 4.996056f, 15.122918f, 5.122668f, 15.348f, 5.348f),
                    PathNode.LineTo(15.349f, 5.349f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.LineTo(18.293f, 5.707f),
                    PathNode.CurveTo(18.745707f, 5.254269f, 19.000023f, 4.640242f, 19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 3.447715f, 19.447716f, 3.0f, 20.0f, 3.0f),
                    PathNode.LineTo(21.0f, 3.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 11.343145f, 8.343146f, 10.0f, 10.0f, 10.0f)
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
