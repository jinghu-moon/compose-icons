package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = tablerFilledIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11c.552 0 1 .448 1 1-.002 3.571-1.907 6.87-5 8.656-.439 .254-.999 .139-1.302-.268l-.064-.098-3-5.19c-.095-.164-.141-.352-.133-.542l.01-.11 .023-.106 .034-.106 .046-.1 .056-.094 .067-.089c.049-.058 .104-.11 .165-.155L13 13.734c.569-.329 .94-.915 .993-1.57L14 12.001c-0-.507 .379-.935 .883-.994L15 11h6Z")
            addPathData("M7 3.344c3.094-1.786 6.906-1.786 10 0 .439 .254 .619 .796 .418 1.262l-.052 .104L14.366 9.9l-.064 .098c-.045 .061-.097 .116-.155 .165l-.089 .067c-.061 .041-.126 .075-.195 .102l-.105 .034-.107 .022c-.185 .028-.375 .004-.547-.07L13 10.266c-.564-.326-1.251-.356-1.842-.082L11 10.266c-.439 .254-.999 .139-1.302-.268L9.634 9.9l-3-5.19C6.358 4.232 6.522 3.62 7 3.344Z")
            addPathData("M9 11c.507 0 .934 .38 .993 .884l.007 .117c-0 .656 .321 1.271 .861 1.645l.237 .152c.061 .045 .116 .097 .165 .155l.067 .089 .056 .095 .045 .099c.014 .036 .026 .07 .035 .106l.022 .107 .011 .11c.007 .15-.021 .299-.08 .437l-.053 .104-3 5.19c-.276 .478-.888 .642-1.366 .366C3.907 18.87 2.002 15.571 2 12c0-.507 .38-.934 .883-.993L3 11h6Z")
        }
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
