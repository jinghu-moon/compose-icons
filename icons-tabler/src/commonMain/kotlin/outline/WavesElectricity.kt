package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WavesElectricity: ImageVector
    get() {
        if (_wavesElectricity != null) return _wavesElectricity!!
        _wavesElectricity = tablerOutlineIcon(
            name = "WavesElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.576f, 11.357f, 4.512f, 10.983f, 5.5f, 11.0f),
                    PathNode.CurveTo(6.488f, 10.983f, 7.424f, 11.357f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.576f, 12.643f, 9.512f, 13.017f, 10.5f, 13.0f),
                    PathNode.CurveTo(11.488f, 13.017f, 12.424f, 12.643f, 13.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.576f, 15.357f, 4.512f, 14.983f, 5.5f, 15.0f),
                    PathNode.CurveTo(6.488f, 14.983f, 7.424f, 15.357f, 8.0f, 16.0f),
                    PathNode.CurveTo(8.576f, 16.643f, 9.512f, 17.017f, 10.5f, 17.0f),
                    PathNode.CurveTo(11.488f, 17.017f, 12.424f, 16.643f, 13.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.576f, 7.357f, 4.512f, 6.983f, 5.5f, 7.0f),
                    PathNode.CurveTo(6.488f, 6.983f, 7.424f, 7.357f, 8.0f, 8.0f),
                    PathNode.CurveTo(8.576f, 8.643f, 9.512f, 9.017f, 10.5f, 9.0f),
                    PathNode.CurveTo(11.488f, 9.017f, 12.424f, 8.643f, 13.0f, 8.0f)
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
                    PathNode.MoveTo(20.0f, 7.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _wavesElectricity!!
    }

private var _wavesElectricity: ImageVector? = null
