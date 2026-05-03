package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorDuotoneIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 176.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.CurveTo(142.58752f, 24.060629f, 96.06063f, 70.58752f, 96.0f, 128.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(52.76235f, 167.99745f, 49.84236f, 169.94662f, 48.60302f, 172.93768f),
                    PathNode.CurveTo(47.363674f, 175.92874f, 48.04936f, 179.3719f, 50.34f, 181.66f),
                    PathNode.LineTo(98.34f, 229.66f),
                    PathNode.CurveTo(99.840546f, 231.16223f, 101.876724f, 232.00629f, 104.0f, 232.00629f),
                    PathNode.CurveTo(106.123276f, 232.00629f, 108.159454f, 231.16223f, 109.66f, 229.66f),
                    PathNode.LineTo(157.66f, 181.66f),
                    PathNode.CurveTo(159.95064f, 179.3719f, 160.63632f, 175.92874f, 159.39697f, 172.93768f),
                    PathNode.CurveTo(158.15764f, 169.94662f, 155.23764f, 167.99745f, 152.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.05511f, 79.42178f, 151.42178f, 40.055107f, 200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 36.418278f, 208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 27.581722f, 204.41827f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 212.69f),
                    PathNode.LineTo(75.31f, 184.0f),
                    PathNode.LineTo(132.69f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
