package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WalletOff: ImageVector
    get() {
        if (_walletOff != null) return _walletOff!!
        _walletOff = tablerOutlineIcon(
            name = "WalletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 4.447716f, 16.552284f, 4.0f, 16.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.MoveTo(4.587f, 4.584f),
                    PathNode.CurveTo(4.013882f, 5.155672f, 3.841879f, 6.016443f, 4.151292f, 6.764465f),
                    PathNode.CurveTo(4.460706f, 7.512487f, 5.190511f, 8.000233f, 6.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.552284f, 8.0f, 19.0f, 8.447715f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 19.552284f, 18.552284f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 6.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(14.895431f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _walletOff!!
    }

private var _walletOff: ImageVector? = null
