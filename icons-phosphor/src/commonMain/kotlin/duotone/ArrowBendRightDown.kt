package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorDuotoneIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.LineTo(104.0f, 176.0f),
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
                    PathNode.MoveTo(207.39f, 172.94f),
                    PathNode.CurveTo(206.15236f, 169.95038f, 203.23566f, 168.00067f, 200.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(159.93938f, 70.58752f, 113.41248f, 24.060629f, 56.0f, 24.0f),
                    PathNode.CurveTo(51.581722f, 24.0f, 48.0f, 27.581722f, 48.0f, 32.0f),
                    PathNode.CurveTo(48.0f, 36.418278f, 51.581722f, 40.0f, 56.0f, 40.0f),
                    PathNode.CurveTo(104.57822f, 40.055107f, 143.94489f, 79.42178f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(100.762344f, 167.99745f, 97.84236f, 169.94662f, 96.60302f, 172.93768f),
                    PathNode.CurveTo(95.36368f, 175.92874f, 96.04936f, 179.3719f, 98.34f, 181.66f),
                    PathNode.LineTo(146.34f, 229.66f),
                    PathNode.CurveTo(147.84055f, 231.16223f, 149.87672f, 232.00629f, 152.0f, 232.00629f),
                    PathNode.CurveTo(154.12328f, 232.00629f, 156.15945f, 231.16223f, 157.66f, 229.66f),
                    PathNode.LineTo(205.66f, 181.66f),
                    PathNode.CurveTo(207.94725f, 179.37076f, 208.63007f, 175.92903f, 207.39f, 172.94f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 212.69f),
                    PathNode.LineTo(123.31f, 184.0f),
                    PathNode.LineTo(180.69f, 184.0f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
