package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad2: ImageVector
    get() {
        if (_deviceGamepad2 != null) return _deviceGamepad2!!
        _deviceGamepad2 = tablerOutlineIcon(
            name = "DeviceGamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(15.5f, 5.0f),
                    PathNode.CurveTo(18.261423f, 5.0f, 20.5f, 7.238577f, 20.5f, 10.0f),
                    PathNode.CurveTo(20.5f, 12.761424f, 18.261423f, 15.0f, 15.5f, 15.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(5.985f, 19.227f),
                    PathNode.CurveTo(5.279462f, 19.969824f, 4.167672f, 20.156445f, 3.258261f, 19.6847f),
                    PathNode.CurveTo(2.34885f, 19.212957f, 1.861091f, 18.196592f, 2.062f, 17.192f),
                    PathNode.LineTo(3.696f, 9.019f),
                    PathNode.CurveTo(4.16368f, 6.681642f, 6.216312f, 4.999438f, 8.6f, 5.0f),
                    PathNode.LineTo(12.0f, 5.0f)
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
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.LineTo(18.07f, 19.284f),
                    PathNode.CurveTo(18.774046f, 20.02482f, 19.882484f, 20.212206f, 20.790924f, 19.743984f),
                    PathNode.CurveTo(21.699364f, 19.275763f, 22.189875f, 18.264254f, 21.995f, 17.261f),
                    PathNode.LineTo(20.395f, 9.029f)
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
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(8.0f, 11.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f)
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
        return _deviceGamepad2!!
    }

private var _deviceGamepad2: ImageVector? = null
