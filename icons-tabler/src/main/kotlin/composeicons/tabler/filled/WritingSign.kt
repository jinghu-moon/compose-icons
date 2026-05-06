package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.WritingSign: ImageVector
    get() {
        if (_writingSign != null) return _writingSign!!
        _writingSign = tablerFilledIcon(
            name = "WritingSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 11c-.483 0-1.021 .725-1 1.983 .013 .783 .29 1.3 1.035 2.07l.107 .107 .101-.134c.466-.643 .714-1.266 .752-1.864L7 13l-.003-.563C6.98 11.153 6.867 11.015 6.19 11.001ZM18 2c1.673 0 3 1.327 3 3v1h-6v-1C15 3.327 16.327 2 18 2M20.707 17.707l-2 2-.08 .071-.043 .034-.084 .054-.103 .052-.084 .032-.08 .023-.143 .023L18.019 20h-2.519c-1.616 0-2.954-.83-4.004-2.393l-.026-.04-.273 .431-.365 .557C9.476 20.589 7.89 20.246 6.132 18.145l-.064-.076-.176 .147q-.897 .727-2.045 1.438l-.332 .203c-.307 .192-.693 .203-1.01 .03-.317-.173-.516-.505-.52-.866-.004-.362 .187-.697 .5-.878 .757-.448 1.482-.949 2.17-1.498l.078-.065-.147-.15C3.588 15.397 3.088 14.526 3.01 13.273L3 13.017C2.962 10.744 4.257 9 6 9c2.052 0 3 .948 3 4 0 1.218-.47 2.392-1.392 3.532l-.11 .13 .28 .36c.784 .985 .994 .992 1.343 .492l.047-.069q.97-1.456 1.437-2.392c.174-.349 .535-.564 .924-.553 .389 .011 .737 .248 .89 .606 .858 2.002 1.878 2.894 3.081 2.894l.085-.001-.292-.292C15.105 17.52 15 17.265 15 17v-9h6v9c-0 .265-.105 .52-.293 .707"),
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
        return _writingSign!!
    }

private var _writingSign: ImageVector? = null
