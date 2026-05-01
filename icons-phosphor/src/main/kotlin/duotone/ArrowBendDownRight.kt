package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorDuotoneIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 146.34f),
                    PathNode.LineTo(181.66f, 98.34f),
                    PathNode.CurveTo(179.3719f, 96.04936f, 175.92874f, 95.36368f, 172.93768f, 96.60302f),
                    PathNode.CurveTo(169.94662f, 97.84236f, 167.99745f, 100.762344f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(79.42178f, 143.94489f, 40.055107f, 104.57822f, 40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 51.581722f, 36.418278f, 48.0f, 32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.CurveTo(24.060629f, 113.41248f, 70.58752f, 159.93938f, 128.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(167.99745f, 203.23764f, 169.94662f, 206.15764f, 172.93768f, 207.39697f),
                    PathNode.CurveTo(175.92874f, 208.63632f, 179.3719f, 207.95064f, 181.66f, 205.66f),
                    PathNode.LineTo(229.66f, 157.66f),
                    PathNode.CurveTo(231.16223f, 156.15945f, 232.00629f, 154.12328f, 232.00629f, 152.0f),
                    PathNode.CurveTo(232.00629f, 149.87672f, 231.16223f, 147.84055f, 229.66f, 146.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 180.69f),
                    PathNode.LineTo(184.0f, 123.31f),
                    PathNode.LineTo(212.69f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
