package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chisel: ImageVector
    get() {
        if (_chisel != null) return _chisel!!
        _chisel = tablerOutlineIcon(
            name = "Chisel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.LineTo(15.5f, 15.5f)
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
                    PathNode.MoveTo(18.347f, 15.575f),
                    PathNode.LineTo(20.427f, 17.654f),
                    PathNode.CurveTo(21.192467f, 18.419743f, 21.192244f, 19.661034f, 20.4265f, 20.4265f),
                    PathNode.CurveTo(19.660757f, 21.191969f, 18.419466f, 21.191742f, 17.654f, 20.426f),
                    PathNode.LineTo(15.574f, 18.347f),
                    PathNode.CurveTo(14.808534f, 17.581257f, 14.808757f, 16.339966f, 15.5745f, 15.5745f),
                    PathNode.CurveTo(16.340242f, 14.809033f, 17.581533f, 14.809258f, 18.347f, 15.575f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.LineTo(13.414f, 10.414f),
                    PathNode.CurveTo(13.789099f, 10.788985f, 13.999887f, 11.29761f, 14.0f, 11.828f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(11.828f, 14.0f),
                    PathNode.CurveTo(11.29761f, 13.999887f, 10.788985f, 13.789099f, 10.414f, 13.414f),
                    PathNode.LineTo(3.0f, 6.0f)
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
        return _chisel!!
    }

private var _chisel: ImageVector? = null
