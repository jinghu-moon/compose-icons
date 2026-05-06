package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpaceShipLine: ImageVector
    get() {
        if (_spaceShipLine != null) return _spaceShipLine!!
        _spaceShipLine = remixIcon(
            name = "SpaceShipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.88 18.049C4.23 12.056 7.075 6.629 11.003 2.18c.108-.122 .243-.272 .408-.451 .299-.325 .805-.346 1.13-.047 .017 .015 .032 .031 .047 .047 .166 .181 .304 .333 .413 .456 3.925 4.448 6.769 9.873 8.119 15.864-2.141 .451-4.34 .747-6.584 .874l-2.089 4.177c-.123 .247-.424 .347-.671 .224-.097-.048-.175-.127-.224-.224L9.464 18.924C7.22 18.796 5.021 18.5 2.88 18.049ZM9.577 16.927l1.157 .066 1.265 2.531 1.265-2.531 1.157-.066c1.422-.081 2.832-.233 4.226-.454C17.323 11.919 15.054 7.705 12 4.085 8.946 7.705 6.677 11.919 5.351 16.472c1.394 .222 2.805 .374 4.226 .454ZM12 14.995c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM12 12.995c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _spaceShipLine!!
    }

private var _spaceShipLine: ImageVector? = null
