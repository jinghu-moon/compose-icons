package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorRegularIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.78 39.25 80.53 16.25C71.829 14.719 63.534 20.53 62 29.23L32.25 198.23c-.735 4.181 .222 8.483 2.66 11.959 2.438 3.475 6.158 5.839 10.34 6.571l130.25 23h0c4.183 .738 8.487-.218 11.965-2.656 3.478-2.439 5.843-6.16 6.575-10.344L223.79 57.76c1.518-8.704-4.307-16.99-13.01-18.51ZM178.26 224h0L48 201 77.75 32 208 55ZM89.34 58.42c.772-4.348 4.921-7.249 9.27-6.48l83 14.65c4.089 .716 6.951 4.442 6.589 8.578-.362 4.136-3.828 7.307-7.979 7.302-.469-.001-.938-.041-1.4-.12L95.82 67.69c-4.348-.772-7.249-4.921-6.48-9.27ZM83.8 89.94c.368-2.09 1.552-3.948 3.29-5.165 1.739-1.217 3.89-1.694 5.98-1.325l83 14.66c4.12 .689 7.016 4.432 6.649 8.593-.367 4.161-3.873 7.339-8.049 7.297-.473 .001-.945-.043-1.41-.13L90.26 99.22c-4.345-.781-7.236-4.934-6.46-9.28ZM78.25 121.45c.786-4.336 4.931-7.22 9.27-6.45L129 122.29c4.087 .716 6.949 4.439 6.59 8.573-.359 4.134-3.82 7.307-7.97 7.307-.469-0-.938-.04-1.4-.12L84.72 130.72c-4.344-.776-7.239-4.924-6.47-9.27Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
