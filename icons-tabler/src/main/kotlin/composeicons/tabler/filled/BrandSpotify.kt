package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSpotify: ImageVector
    get() {
        if (_brandSpotify != null) return _brandSpotify!!
        _brandSpotify = tablerFilledIcon(
            name = "BrandSpotify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M14.832 14.945C13.547 13.018 10.478 12.813 8.445 14.168c-.46 .307-.584 .927-.277 1.387 .307 .46 .927 .584 1.387 .277 1.195-.797 3.014-.675 3.613 .223 .307 .46 .927 .584 1.387 .277 .46-.307 .584-.927 .277-1.387M16.1 11.7C13.631 9.848 10.205 9.513 7.492 11.111c-.476 .281-.635 .894-.354 1.37 .281 .476 .894 .635 1.37 .354 1.986-1.171 4.544-.92 6.392 .465 .442 .331 1.069 .242 1.4-.2 .331-.442 .242-1.069-.2-1.4M17.53 8.652C13.853 6.354 9.764 6.5 6.553 8.106c-.476 .256-.661 .844-.42 1.327 .242 .483 .823 .687 1.314 .461 2.635-1.317 5.997-1.437 9.023 .454 .468 .293 1.085 .15 1.378-.318 .293-.468 .15-1.085-.318-1.378"),
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
        return _brandSpotify!!
    }

private var _brandSpotify: ImageVector? = null
