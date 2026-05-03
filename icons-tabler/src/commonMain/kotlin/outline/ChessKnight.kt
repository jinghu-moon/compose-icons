package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerOutlineIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(6.553f, 16.724f),
                    PathNode.CurveTo(6.214271f, 16.893263f, 6.000202f, 17.239334f, 6.0f, 17.618f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 17.618f),
                    PathNode.CurveTo(17.999798f, 17.239334f, 17.78573f, 16.893263f, 17.447f, 16.724f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.LineTo(6.509f, 8.148f),
                    PathNode.CurveTo(6.127642f, 8.382339f, 5.948456f, 8.841555f, 6.070315f, 9.27225f),
                    PathNode.CurveTo(6.192175f, 9.702946f, 6.585397f, 10.000205f, 7.033f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(7.927f, 16.0f),
                    PathNode.LineTo(15.888f, 16.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 8.0f, 14.91f, 5.017f, 12.0f, 4.0f),
                    PathNode.CurveTo(10.06f, 3.322f, 9.06f, 2.989f, 9.0f, 3.0f)
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
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
