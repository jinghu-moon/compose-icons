package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerFilledIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.209139f, 2.0f, 16.0f, 3.790861f, 16.0f, 6.0f),
                    PathNode.CurveTo(15.992795f, 6.689982f, 15.843704f, 7.371104f, 15.562f, 8.001001f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.529093f, 8.000587f, 16.966166f, 8.413211f, 16.997171f, 8.941395f),
                    PathNode.CurveTo(17.02818f, 9.469579f, 16.642391f, 9.93051f, 16.117f, 9.993f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.LineTo(14.737f, 10.0f),
                    PathNode.LineTo(15.977f, 15.79f),
                    PathNode.CurveTo(16.091843f, 16.322214f, 15.759802f, 16.848501f, 15.23f, 16.974f),
                    PathNode.LineTo(15.117f, 16.994f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(8.718551f, 17.000093f, 8.450091f, 16.881578f, 8.260522f, 16.673548f),
                    PathNode.CurveTo(8.070953f, 16.465515f, 7.977825f, 16.18723f, 8.004f, 15.907f),
                    PathNode.LineTo(8.022001f, 15.79f),
                    PathNode.LineTo(9.262f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(7.470907f, 9.999413f, 7.033836f, 9.586789f, 7.002828f, 9.058605f),
                    PathNode.CurveTo(6.971821f, 8.530421f, 7.35761f, 8.069491f, 7.883f, 8.007f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(8.438f, 8.0f),
                    PathNode.CurveTo(8.223119f, 7.515858f, 8.084154f, 7.001485f, 8.026f, 6.475f),
                    PathNode.LineTo(8.006f, 6.216f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 3.790861f, 9.790861f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(5.447716f, 18.0f, 5.0f, 18.447716f, 5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.01501f, 21.000254f, 18.869259f, 20.240158f, 18.987f, 19.232f),
                    PathNode.LineTo(18.998f, 19.058f),
                    PathNode.CurveTo(19.013964f, 18.783232f, 18.915974f, 18.514032f, 18.727116f, 18.31382f),
                    PathNode.CurveTo(18.538258f, 18.11361f, 18.27523f, 18.000088f, 18.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chess!!
    }

private var _chess: ImageVector? = null
